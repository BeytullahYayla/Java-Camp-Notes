package oopIntro;

public class Category {
	public Category() {
		System.out.println("Category Constructor Executed");
	}
	public Category(int id,String name) {
		this.id=id;
		this.name=name;
	}
	int id;
	String name;

}
