package Assignment3.Business.Concrete;

import Assignment3.Business.Abstract.SalesPlatformService;
import Assignment3.Entities.Concrete.Customer;

public class SalesPlatformManager implements SalesPlatformService{

	
	public void Sale(Customer customer) {
		System.out.println(customer.getFirstName()+": Bought Successfully");
		
	}

}
