package Assignment3.Business.Concrete;

import Assignment3.Business.Abstract.CustomerCheckService;
import Assignment3.Business.Abstract.CustomerService;
import Assignment3.Business.Abstract.Logger;
import Assignment3.Entities.Concrete.Customer;

public class CustomerManager implements CustomerService{

	CustomerCheckService customerCheckService;
	Logger logger;
	
	//Dependency Injection
	public CustomerManager(CustomerCheckService customerCheckService,Logger logger) {
		
		this.customerCheckService = customerCheckService;
		this.logger=logger;
	}

	@Override
	public void addCustomer(Customer customer) {
		
		if(customerCheckService.CheckIfCustomerExists(customer)) {
			System.out.println(customer.getFirstName()+" added");
			logger.Log(customer.getFirstName());
		}
		else {
			System.out.println("Customer is not registered in E-Devlet");
		}
		
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		if(customerCheckService.CheckIfCustomerExists(customer)) {
			System.out.println(customer.getFirstName()+" updated");
			logger.Log(customer.getFirstName());
		}
		else {
			System.out.println("Customer is not registered to E Devlet");
		}
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		
		if(customerCheckService.CheckIfCustomerExists(customer)) {
			System.out.println(customer.getFirstName()+" deleted");
			logger.Log(customer.getFirstName());
		}
		else {
			System.out.println("Customer is not registered to E Devlet");
		}
		
	}
	

}
