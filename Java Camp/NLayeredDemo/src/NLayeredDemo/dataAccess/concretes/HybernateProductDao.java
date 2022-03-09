package NLayeredDemo.dataAccess.concretes;

import java.util.List;

import NLayeredDemo.dataAccess.abstracts.ProductDao;
import NLayeredDemo.entities.concretes.Product;

public class HybernateProductDao implements ProductDao {

	
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+"Added");
		
	}

	
	public void update(Product product) {
		System.out.println(product.getProductName()+"Updated");
		
	}


	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" Deleted");
		
	}

	
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
