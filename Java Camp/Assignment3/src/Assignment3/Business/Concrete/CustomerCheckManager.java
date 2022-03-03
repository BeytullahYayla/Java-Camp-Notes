package Assignment3.Business.Concrete;

import Assignment3.Business.Abstract.CustomerCheckService;
import Assignment3.Entities.Concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfCustomerExists(Customer customer) {
		
		return true;
	}

}
