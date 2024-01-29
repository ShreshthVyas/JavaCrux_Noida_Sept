package Lecture39;

public class Hashmap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String, Integer>  map  = new Hashmap<>();
		map.put("Bhupendar", 78);
		map.put("Rohit", 79);
		map.put("Yogit", 10);
		map.put("Ashish", 100);
		map.put("Dhruv", 8);
		map.put("B", 78);
		map.put("R", 79);
		map.put("Y", 10);
		map.put("J", 100);
		map.put("K", 8);
		System.out.println(map);
		System.out.println(map.containskey("Yogit"));
		System.out.println(map.get("Yogit"));
		map.remove("Yogit");
		System.out.println(map);
//		System.out.println(map.bkt.size());
		
	}

}
