package net.ramapuram.resources;

import java.util.List;

import net.ramapuram.model.Product;

public interface IDAOInterface {
	public void create (Product product);
	public void update (Product product);
	public void delete (String productId);
	public Product retrieve (String productId);
	public List<Product> retrieveall (); 

}
