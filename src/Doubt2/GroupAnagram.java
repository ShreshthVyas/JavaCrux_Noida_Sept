package Doubt2;

import java.util.*;

public class GroupAnagram {
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char ch [] = str.toCharArray();
			Arrays.sort(ch);
			String temp = new String(ch);
			if(map.containsKey(temp)) {
				map.get(temp).add(str);
			}
			else {
				map.put(temp, new ArrayList<String>());
				map.get(temp).add(str);
			}
		}
		return new ArrayList<>(map.values());
	}
}
