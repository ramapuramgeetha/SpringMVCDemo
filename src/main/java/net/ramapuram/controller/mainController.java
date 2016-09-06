package net.ramapuram.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import resources.DAOClass;
import resources.IDAOInterface;
import resources.Product;

@Controller
public class mainController {
@RequestMapping("/")
	public String ShowProducts(){
		return ("index");
	}
	
@RequestMapping (value="/Products", method=RequestMethod.GET)
	public ModelAndView mainController(){
	DAOClass dataList = new DAOClass();
	ModelAndView Disp = new ModelAndView("Products");
	
	List <Product> Prods =new ArrayList<Product> (); 
			Prods =dataList.getProducts();
	
	Iterator <Product> it = Prods.iterator();
	while (it.hasNext()) {
		Product o = it.next();
		System.out.println( o.getProdID()  + "  " + o.getProdCategory() + "  " + o.getProdName() + "  " + o.getProdPrice() );
	}
	
	Disp.addObject("data",Prods);
	return (Disp);
	
		
	}

}
