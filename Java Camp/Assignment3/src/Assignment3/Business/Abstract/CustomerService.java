package Assignment3.Business.Abstract;

import Assignment3.Entities.Concrete.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);

}
