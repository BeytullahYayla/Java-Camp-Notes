package Assignment3.Business.Concrete;

import Assignment3.Business.Abstract.Logger;

public class EmailLogger extends Logger{

	@Override
	public void Log(String message) {
		System.out.println("Logged to Email:"+message);
		
	}

}
