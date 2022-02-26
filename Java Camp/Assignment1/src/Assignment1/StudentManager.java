package Assignment1;

public class StudentManager extends UserManager {
	@Override
	public void changeName() {
		System.out.println("Student's name changed");
	}
	@Override
	public void resetPassword() {
		System.out.println("Student's password resetted");
	}
	@Override
	public void logIn() {
		System.out.println("Login Successfull for student");
	}
	public void registerForLesson() {
		System.out.println("Registered For Lesson ");
	}
}
