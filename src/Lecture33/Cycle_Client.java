package Lecture33;

public class Cycle_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleRemoval c = new CycleRemoval();
		c.addfirst(1);
		c.addLast(2);
		c.addLast(3);
		c.addLast(4);
		c.addLast(5);
		c.addLast(6);
		c.addLast(7);
		c.addLast(8);
//		c.Display();
		c.createcycle();
//		c.cycleremoval1();
//		c.cycleremoval2();
		c.FloyCycleRemoval();
		c.Display();
		
	}

}
