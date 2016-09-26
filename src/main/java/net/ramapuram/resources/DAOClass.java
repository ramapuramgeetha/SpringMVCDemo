package net.ramapuram.resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.ramapuram.model.Product;

@Repository 
@Transactional
public class DAOClass implements IDAOInterface {

	public  DAOClass() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private Product Product;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public DAOClass(SessionFactory sessionFactory) {
		this.sessionFactory =sessionFactory;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(Product product) {
		sessionFactory.getCurrentSession().save(product);

	}

	@Override
	public void update(Product product) {
		
			sessionFactory.getCurrentSession().update(product);
		
	}

	@Override
	public void delete(String productId) {
		
			sessionFactory.getCurrentSession().delete(retrieve(productId));

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
