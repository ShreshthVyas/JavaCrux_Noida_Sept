package Lecture38;

public abstract class abstract_demo {
	
	public abstract void fun();
	
	public void f2() {
		
	}
	public abstract int payment();
	public static void main(String[] args) {
		abstract_demo ab =  new abstract_demo() {
			
			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int payment() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
	}
}
