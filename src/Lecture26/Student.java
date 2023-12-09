package Lecture26;

public class Student {
	int age;
	String name;
//	static int count;
	public void greet() {
		System.out.println(name + " " + age);
	}
//	public void greet(String name , int age) {
//		System.out.println(name +" says hi to " + this.name + " and my age is "+ this.age);
//	}
	static {
		System.out.println("Hello");
	}
	

}
