package Lecture26;

public class Person {
	int age ;
	String name ;
//	private int password =10;
//	
//	public Person() { 
//		this.age = 18;
//		this.name = "Sher";
//	}
//	public Person(int age , String name) {
//		this.age = age;
//		this.name = name;
//	}
	public void sayhi() {
		System.out.println("Hi");
	}
//	public int getAge() {
//		return age;
//	}
	public void setAge(int age) throws Exception  {
		try{
			if(age<0) {
				throw new Exception("Ayein ? Baingan");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally");
		}
		
//		this.age = age;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
}
