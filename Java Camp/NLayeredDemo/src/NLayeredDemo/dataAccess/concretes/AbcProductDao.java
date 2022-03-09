package NLayeredDemo.dataAccess.concretes;

import java.util.List;

import NLayeredDemo.dataAccess.abstracts.ProductDao;
import NLayeredDemo.entities.concretes.Product;

public class AbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println(product.getProductName()+" abc ile eklendi");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getProductName()+" abc ile güncellendi");
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" abc ile silindi");
		
	}

	@Override
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
