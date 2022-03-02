package Interface;

public class FileLogger implements Logger{

	@Override
	public void Log(String message) {
		System.out.println("File Logged: "+message);
	}
	

}
