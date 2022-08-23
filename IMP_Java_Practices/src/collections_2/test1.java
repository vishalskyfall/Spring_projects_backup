package collections_2;

import java.util.ArrayList;
import java.util.Iterator;

public class test1 {
	public static void main(String[] args) {
		ArrayList<Integer> aa= new ArrayList<>();
		aa.add(1);
		aa.add(1,70);
		for(Integer i :aa) {
			System.out.println(i);
		}
		Iterator<Integer> it = aa.iterator();
		while(it.hasNext()) {
			System.out.println("1"+it.next());
		}
		
		System.out.println(aa);
		aa.remove(Integer.valueOf(70));
		aa.set(0, 99);//aa.contains .size()
		System.out.println(aa);
		aa.clear();
		
	}
}
