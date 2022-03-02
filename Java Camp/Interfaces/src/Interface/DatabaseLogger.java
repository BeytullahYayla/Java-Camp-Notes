package Interface;

public class DatabaseLogger implements Logger{

	@Override
	public void Log(String message) {
		System.out.println(message);
		
	}

}
