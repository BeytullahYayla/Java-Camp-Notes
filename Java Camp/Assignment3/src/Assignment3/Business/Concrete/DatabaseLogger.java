package Assignment3.Business.Concrete;

import Assignment3.Business.Abstract.Logger;

public class DatabaseLogger extends Logger{

	@Override
	public void Log(String message) {
		System.out.println("Logged To Database:"+message);
		
	}
	
}
