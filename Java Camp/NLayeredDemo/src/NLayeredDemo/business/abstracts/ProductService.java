package NLayeredDemo.business.abstracts;

import java.util.List;

import NLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void Add(Product product);
	List<Product> GetAll();

}
