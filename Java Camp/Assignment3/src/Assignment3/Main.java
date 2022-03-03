package Assignment3;

import Assignment3.Business.Abstract.CustomerCheckService;
import Assignment3.Business.Concrete.CustomerCheckManager;
import Assignment3.Business.Concrete.CustomerManager;
import Assignment3.Business.Concrete.DatabaseLogger;
import Assignment3.Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CustomerManager customerManager=new CustomerManager(new CustomerCheckManager(),new DatabaseLogger());
		Customer customer1=new Customer(1,"Beytullah","Yayla","26/02/2002","48835155908");
		customerManager.addCustomer(customer1);

	}

}

//1.     Oyuncularýn sisteme kayýt olabileceði, bilgilerini güncelleyebileceði, kayýtlarýný silebileceði bir ortamý simule ediniz. Müþteri bilgilerinin doðruluðunu e-devlet sistemlerini kullanarak doðrulama yapmak istiyoruz. (E-devlet sistemlerinde doðrulama TcNo, Ad, Soyad, DoðumYýlý bilgileriyle yapýlýr. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)

//2.     Oyun satýþý yapýlabilecek satýþ ortamýný simule ediniz.( Yapýlan satýþlar oyuncu ile iliþkilendirilmelidir. Oyuncunun parametre olarak metotta olmasýný kastediyorum.)

//3.     Sisteme yeni kampanya giriþi, kampanyanýn silinmesi ve güncellenmesi imkanlarýný simule ediniz.

//4.     Satýþlarda kampanya entegrasyonunu simule ediniz.

//5.     Ödevinizi Github’a yükleyiniz. Github linkinizi paylaþýnýz.

//6. Diðer arkadaþlarýnýnýz Github kodlarýný inceleyiniz. Ona yýldýz vermeyi unutmayýnýz :)