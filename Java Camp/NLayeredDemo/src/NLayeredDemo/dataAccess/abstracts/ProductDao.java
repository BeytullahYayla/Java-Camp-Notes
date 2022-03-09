package NLayeredDemo.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import NLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int id);
	List<Product> getAll();

}
