package Lecture37;

public class Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp =  new Heap();
		hp.add(4);
		hp.add(5);
		hp.add(20);
		hp.add(30);
		hp.add(-1);
		hp.add(6);
		hp.add(7);
		hp.add(11);
		hp.display();
		System.out.println(hp.remove());
		hp.display();
	}

}
