package Inheritence2;

public class main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		DatabaseLogger dbLogger=new DatabaseLogger();
		customerManager.addCustomer(dbLogger);

	}

}
