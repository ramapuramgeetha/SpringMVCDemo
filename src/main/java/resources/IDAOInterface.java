package resources;

import java.util.List;

import net.ramapuram.model.Product;

public interface IDAOInterface {
	public boolean create (Product product);
	public boolean update (Product product);
	public boolean delete (String productId);
	public Product retrieve (String productId);
	public List<Product> retrieveall (); 

}
