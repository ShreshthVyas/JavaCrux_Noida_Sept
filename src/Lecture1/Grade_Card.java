package Lecture1;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 90;  
		if(marks<= 100 && marks>=90) {
			System.out.println("A");
		}
		else if(marks< 90 && marks>=80) {
			System.out.println("B");
		}
		else if(marks< 80 && marks>=70) {
			System.out.println("C");
		}
		else if(marks< 70 && marks>=60) {
			System.out.println("D");
		}
		else if(marks< 60 && marks>=40) {
			System.out.println("E");
		}
		else{
			System.out.println("Fail");
		}
	}

}
