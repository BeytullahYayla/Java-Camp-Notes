package Assignment2.Business.Concrete;

import Assignment2.Business.Abstract.CustomerCheckService;
import Assignment2.Entities.Concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
	}

}
