package resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.ramapuram.model.Product;

@Repository ("IDAOInterface")
public class DAOClass implements IDAOInterface {

	@Autowired
	private Product Product;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public DAOClass(SessionFactory sessionFactory) {
		this.sessionFactory =sessionFactory;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Product product) {
		try {
			sessionFactory.getCurrentSession().save(product);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(String productId) {
		try {
			sessionFactory.getCurrentSession().delete(retrieve(productId));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Product retrieve(String productId) {
		//SELECT * FROM PRODUCT WHERE PRODID = 'PRODID';
		String hql ="Select * from Product where prodID ='"+productId +"'";
		Query qry = sessionFactory.getCurrentSession().createQuery(hql);
		List <Product> list =qry.list();
		
		if (list == null || list.isEmpty())
		{
			return null;
		}
		
		return list.get(0);
	}

	@Override
	public List<Product> retrieveall() {
		// TODO Auto-generated method stub
		return null;
	}

}
