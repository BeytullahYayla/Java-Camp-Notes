package Inheritence;

public class main {

	public static void main(String[] args) {
		IndividualCustomer beytullah=new IndividualCustomer();
		CooperateCustomer hepsiBurada=new CooperateCustomer();
		CustomerManager customerManager=new CustomerManager();
		SendikaCustomer sendikaCustomer=new SendikaCustomer();
		beytullah.id=1;//As we've seen we can access id 
		hepsiBurada.customerNumber="12345";//Also we can access to customerNumber for Corparate Customers
		beytullah.customerNumber="6789";
		sendikaCustomer.customerNumber="932931";
		customerManager.addCustomer(hepsiBurada);
		customerManager.addCustomer(beytullah);
		customerManager.addCustomer(sendikaCustomer);
		Customer[] customers= {beytullah,hepsiBurada,sendikaCustomer};
		customerManager.addMultiple(customers);
		
		//As we've seen base class keeps both individual and corparate customer's references
		//Open-closed-principle
	}

}
