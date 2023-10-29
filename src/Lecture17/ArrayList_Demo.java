package Lecture17;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =  new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(40);
		
		
		System.out.println(list.get(1));
		
		list.add(1, 400);
		System.out.println(list.get(1));
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		list.set(1, 200);
		
		System.out.println(list.get(1));
		
		list.remove(1);
		
		System.out.println(list.contains(200));
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		
	}

}
