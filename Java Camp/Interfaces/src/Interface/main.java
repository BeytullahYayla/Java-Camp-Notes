package Interface;

public class main {

	public static void main(String[] args) {
		Logger[] loggers= {new FileLogger(),new DatabaseLogger(),new SmsLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer beytullah=new Customer();
		beytullah.setFirstName("Beytullah");
		customerManager.addCustomer(beytullah);

	}

}
