package NLayeredDemo.core;

import NLayeredDemo.jLogger.JLoggerManager;

public class JLoggerAdapterManager implements LoggerService {

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		JLoggerManager jLoggerManager=new JLoggerManager();
		jLoggerManager.log(message);
	}

}
