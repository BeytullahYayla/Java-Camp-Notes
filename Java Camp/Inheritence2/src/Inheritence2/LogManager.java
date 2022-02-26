package Inheritence2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("Database Logged");
		}
		else if(logType==2) {
			System.out.println("File Logged");
		}
		else{
			System.out.println("Mail Logged");
		}
		
		
	}

}
//1-)Database
//2-)File
//3-)Mail