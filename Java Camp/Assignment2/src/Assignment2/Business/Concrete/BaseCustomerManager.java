package Assignment2.Business.Concrete;
import Assignment2.Business.Abstract.CustomerService;
import Assignment2.Entities.Concrete.Customer;


public abstract class BaseCustomerManager implements CustomerService{
	public void Save(Customer customer) {
		System.out.println("Saved To Db:"+customer.getFirstName());
	}
}
