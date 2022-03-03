package Assignment3.Business.Abstract;

import Assignment3.Entities.Concrete.Customer;

public interface CustomerCheckService {
	boolean CheckIfCustomerExists(Customer customer);

}
