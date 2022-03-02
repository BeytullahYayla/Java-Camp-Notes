package Interface;

import java.util.Iterator;

public class CustomerManager {
	
	//Dependency Injection
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	//loosly-tightly coupled
	public void addCustomer(Customer customer) {
		System.out.println(customer.getFirstName()+" added");
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void deleteCustomer(Customer customer) {
		System.out.println(customer.getFirstName()+"deleted");
		for(Logger logger:loggers) {
			logger.Log(customer.getFirstName());
		}
	}

}
