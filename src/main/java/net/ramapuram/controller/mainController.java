package net.ramapuram.controller;

import net.ramapuram.resources.DAOClass;
import net.ramapuram.resources.IDAOInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.xml.internal.bind.v2.model.core.ID;

import net.ramapuram.model.Product;

@Controller

public class mainController {

	@Autowired
	private IDAOInterface data;
	
@RequestMapping("/")
	public String ShowProducts(){
		return ("index");
	}

/*
@RequestMapping (value="/Products", method=RequestMethod.GET)
public ModelAndView mainController(){
IDAOInterface dataList =null;
ModelAndView Disp = new ModelAndView("Products");
Product prod =dataList.retrieve("PR1");
Disp.addObject("data",prod);
return (Disp);
}
*/


@RequestMapping (value="/Save", method=RequestMethod.POST)
public String save(@ModelAttribute ("productcommand") Product p, HttpServletRequest request, BindingResult result){

 Product product1= new Product("PR1", "Guitar", "MyGuitar",3500.00);
 Product product2= new Product("PR2", "Guitar", "MyGuitar",3500.00);
 Product product3= new Product("PR3", "Guitar", "MyGuitar",3500.00);
 data.create (product1);
 data.create (product2);
 data.create (product3);
return ("Hello");
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
	

