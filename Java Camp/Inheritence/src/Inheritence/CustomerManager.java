package Inheritence;

import java.util.Iterator;

public class CustomerManager {
	public void addCustomer(Customer customer) {
		System.out.println(customer.customerNumber+" Added");
		
	}
	//bulk-insert
	public void addMultiple(Customer[] customers) {
			for(Customer customer:customers) {
				addCustomer(customer);
			}
	}
	
}
