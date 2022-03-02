package Assignment2.Business.Abstract;

import Assignment2.Entities.Concrete.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);


}
