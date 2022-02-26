package Inheritence2;

public class CustomerManager {
	//We can actually send DatabaseLogger,EmailLogger or FileLogger as a paramater in addCustomer 
	public void addCustomer(Logger logger) {
		
		
		logger.Log();
	}

}
