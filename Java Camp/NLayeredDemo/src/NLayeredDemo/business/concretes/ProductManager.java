package NLayeredDemo.business.concretes;

import java.util.List;

import NLayeredDemo.business.abstracts.ProductService;
import NLayeredDemo.core.LoggerService;
import NLayeredDemo.dataAccess.abstracts.ProductDao;
import NLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	//Dependency Injection
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		
		this.productDao = productDao;
	}

	@Override
	public void Add(Product product) {
		
		if (product.getCategoryId()==1) {
			System.out.println("Kategori No 1 olamaz");
			return;
		}
		this.productDao.add(product);
		loggerService.logToSystem(product.getProductName()+"Logged");
	}

	@Override
	public List<Product> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
