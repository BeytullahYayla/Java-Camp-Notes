package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private ProductService productService;
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService=productService;
	}
	
	
	@GetMapping("/getAll")
	public List<Product> getAll(){
		return this.productService.getAll();
	}

}
