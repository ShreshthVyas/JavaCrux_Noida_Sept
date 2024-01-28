package Lecture38;

public class Abstract_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstract_demo ab = new abstract_demo() {

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
		ab.fun();
		ab.f2();
	}

}
