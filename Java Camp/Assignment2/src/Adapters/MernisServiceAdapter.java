package Adapters;

import java.rmi.RemoteException;
import Assignment2.Business.Abstract.CustomerCheckService;
import Assignment2.Entities.Concrete.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
