package Assignment2;

import Assignment2.Business.Concrete.BaseCustomerManager;
import Assignment2.Business.Concrete.CustomerCheckManager;
import Assignment2.Business.Concrete.StarbucksCustomerManager;
import Assignment2.Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
		Customer beytullah=new Customer();
		beytullah.setFirstName("Beytullah");
		BaseCustomerManager scm=new StarbucksCustomerManager(new CustomerCheckManager());
		scm.Save(beytullah);

	}

}
