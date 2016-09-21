package net.ramapuram.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.ramapuram.model.Product;
import resources.DAOClass;
import resources.IDAOInterface;

@Controller

public class mainController {
@RequestMapping("/")
	public String ShowProducts(){
		return ("index");
	}


@RequestMapping (value="/Products", method=RequestMethod.GET)
public ModelAndView mainController(){
IDAOInterface dataList =null;
ModelAndView Disp = new ModelAndView("Products");
Product prod =dataList.retrieve("PR1");
Disp.addObject("data",prod);
return (Disp);
}
@RequestMapping (value="/Save", method=RequestMethod.GET)
public ModelAndView save(){

	IDAOInterface data = new DAOClass();

 Product product1= new Product("PR1", "Guitar", "MyGuitar",3500.00);
 Product product2= new Product("PR2", "Guitar", "MyGuitar",3500.00);
 Product product3= new Product("PR3", "Guitar", "MyGuitar",3500.00);
}
/*
List <Product> Prods =new ArrayList<Product> (); 
		

Iterator <Product> it = Prods.iterator();
while (it.hasNext()) {
	Product o = it.next();
	System.out.println( o.getProdID()  + "  " + o.getProdCategory() + "  " + o.getProdName() + "  " + o.getProdPrice() );
}

Disp.addObject("data",Prods);

return (Disp);*/

}
	

