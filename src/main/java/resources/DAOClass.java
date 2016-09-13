package resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.ramapuram.model.Product;

public class DAOClass implements IDAOInterface {

	public DAOClass() {
		// TODO Auto-generated constructor stub
	}

	public List<Product> getProducts() {
		List <Product> Prods= new ArrayList<Product>();
		Product p1 = new Product("G1", "Guitar", "Givson", 3000.00 );
		Product p2 = new Product("K1", "Keyboard", "Yamaha", 23000.00 );
		Product p3 = new Product("K2", "Keyboard", "Yamaha 4300", 25000.00 );
		Product p4 = new Product("D1", "Drums", "Custom", 10000.00 );
		Prods.add(p1);
		Prods.add(p2);
		Prods.add(p3);
		Prods.add(p4);
		
			Iterator <Product> it = Prods.iterator();
		while (it.hasNext()) {
			Product o = it.next();
			System.out.println( o.getProdID()  + "  " + o.getProdCategory() + "  " + o.getProdName() + "  " + o.getProdPrice() );
		}
		
		return Prods;
		
	}

}
