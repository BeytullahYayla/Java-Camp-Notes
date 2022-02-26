package Assignment1;

public class InstructorManager extends UserManager{

	@Override
	public void changeName() {
		System.out.println("Instructor name changed successfully");
	}
	@Override 
	public void resetPassword() {
		System.out.println("Instructor password resetted");
	}
	@Override
	public void logIn() {
		System.out.println("Login successfull for instructor");
	}
	public void startLesson() {
		System.out.println("Class started...");
	}
}
