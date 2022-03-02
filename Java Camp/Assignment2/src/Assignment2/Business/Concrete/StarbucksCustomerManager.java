package Assignment2.Business.Concrete;

import Assignment2.Business.Abstract.CustomerCheckService;
import Assignment2.Entities.Concrete.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	//Dependency Injection
	CustomerCheckService customerCheckPerson;
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckPerson) {
		
		this.customerCheckPerson = customerCheckPerson;
	}


	@Override
	public void SaveDb(Customer customer) {
		if(customerCheckPerson.checkIfRealPerson(customer)) {
			
			super.Save(customer);
		}
		else {
			System.out.println("Something went wrong");
		}
		
	}


	
}
