package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class traverse {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); // typeSafe
		al.add(11);
		al.add(101);
		al.add(99);
		al.add(01);
		al.add(1, 111);
		System.out.println("----------------for ----------------");
		// for each
		for (Integer v : al) {
			System.out.println(v);
		}
		System.out.println("----------------iterator forward traversing ----------------");
		// iterator forward traversing
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer v = itr.next();
			System.out.println(v);
		}
		System.out.println("-----------list iterator backward traversing---------------------");

		// list iterator backward traversing
		ListIterator<Integer> ltr = al.listIterator(al.size()); // size mandatory
		while (ltr.hasPrevious()) {
			Integer v = ltr.previous();
			System.out.println(v);
		}
		System.out.println("------------for each--------------------");

		// for each

		al.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("--------------treeset sorted------------------");

		// treeset sorted
		TreeSet<Integer> t = new TreeSet<>();
		t.addAll(al);
		t.forEach(tt -> {
			System.out.println(tt);
		});
		System.out.println("----------------hashmap----------------");
		//hashmap
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "Vishal");
		hs.put(3, "Vishwa");
		hs.put(2, "Vishal"); // already sorted by key 
		hs.put(1, "Vishal"); // duplicate no. but same val with diff key can be possible
		
		hs.forEach((v,n)->{
			System.out.println(v+"->"+n);
		});
	}
}
