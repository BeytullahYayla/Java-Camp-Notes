package Assignment1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthManager authManager=new AuthManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		authManager.logIn(instructorManager);
		authManager.logIn(studentManager);
	
	}

}
