package NLayeredDemo;

import NLayeredDemo.business.concretes.*;
import NLayeredDemo.core.JLoggerAdapterManager;
import NLayeredDemo.dataAccess.concretes.AbcProductDao;
import NLayeredDemo.dataAccess.concretes.HybernateProductDao;
import NLayeredDemo.entities.concretes.Product;
import NLayeredDemo.business.abstracts.ProductService;
public class Main {

	public static void main(String[] args) {
		//Will solve by IoC
		ProductService productService=new ProductManager(new HybernateProductDao(),new JLoggerAdapterManager());
		ProductService productServiceAbc=new ProductManager(new AbcProductDao(),new JLoggerAdapterManager());
		Product product=new Product(1,2,"Araba",100000,5);
		productService.Add(product);
		productServiceAbc.Add(product);

	}

}
