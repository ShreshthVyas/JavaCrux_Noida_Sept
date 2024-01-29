package Lecture39;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , Integer>  map  = new HashMap<>();
		//O(1)
		map.put("Bhupendar", 78);
		map.put("Rohit", 79);
		map.put("Yogit", 10);
		map.put("Ashish", 100);
		map.put("Dhruv", 8);
//		map.put(null, 10);
//		map.put(null, 19);
		
		System.out.println(map);
////		//O(1)
////		map.put("Dhruv", 80);
////		System.out.println(map.get("Dhruv"));
////		
////		//O(1)
////		System.out.println(map.containsKey("ogit"));
//		
//		TreeMap<String , Integer> map1 =  new TreeMap<>();
//		
//		// O(log(n))
//		map1.put("Bhupendar", 78);
//		map1.put("Rohit", 79);
//		map1.put("Yogit", 10);
//		map1.put("Ashish", 100);
//		map1.put("Dhruv", 8);
////		map1.put(null, 12);
//		System.out.println(map1);
//		
//		LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
//		map2.put("Bhupendar", 78);
//		map2.put("Rohit", 79);
//		map2.put("Yogit", 10);
//		map2.put("Ashish", 100);
//		map2.put("Dhruv", 8);
//		map2.put(null, 11);
//		System.out.println(map2);
		
		
		for (String str : map.keySet()) {
			System.out.println(map.get(str));
		}

	}

}
