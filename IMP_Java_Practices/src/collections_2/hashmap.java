package collections_2;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
public static void main(String[] args) {
	HashMap<String, Integer> hs = new HashMap<>();
	hs.put("key1", 11);
	hs.put("key2", 112);
	hs.put("key3", 113); //same key par override thai jay
	//putifabsent
	
	for(Map.Entry<String, Integer> e:hs.entrySet()) {
		System.out.println(e); // get value and get key pan 6 getKey getValue
	}
	for(String k : hs.keySet()) {
		System.out.println("key "+k); //contains value & is empty
	} //treemap ma sort thay and ologn so good
System.out.println(hs);
}
}
