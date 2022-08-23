package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class star {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); // typeSafe
		LinkedList ll = new LinkedList(); // UntypeSafe anything you can add
		al.add(11);
		al.add(101);
		al.add(99);
		al.add(01);
		al.add(1,111);
		System.out.println("ArrayList "+al);
		Vector<Integer> v = new Vector<>();
		v.addAll(al);
		System.out.println("Vector "+v);
		
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(11);
		h.add(101);
		h.add(99);
		h.add(01);
		h.add(11);
		System.out.println("Hashset "+h);
		TreeSet<Integer> t = new TreeSet<>();
		t.addAll(h);
		System.out.println("Tree sorted "+t);
		
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "Vishal");
		hs.put(3, "Vishwa");
		hs.put(2, "Vishal"); // already sorted by key 
		hs.put(1, "Vishal"); // duplicate no. but same val with diff key can be possible
		System.out.println("Hashmap "+hs);
		
		TreeMap<Integer, String> ts = new TreeMap<>();
		ts.putAll(hs);
		System.out.println("Treemap sorted "+ts);
	}
}
