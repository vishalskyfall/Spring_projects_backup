package collections_2;

import java.util.LinkedList;
import java.util.Scanner;

public class test_findFirstKNonRepeating {
	public static void main(String[] args) {
		LinkedList<Character> hs = new LinkedList<>();
		LinkedList<Character> h = new LinkedList<>();
		LinkedList<Character> last = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String test = sc.next();
		int i = 0, c = 2;
		for (; i < test.length(); i++) {
			if (hs.contains(test.charAt(i))) {
				
				h.add(test.charAt(i));
				//hs.remove(test.charAt(i));
				System.out.println(test.charAt(i));
			}
			else {
			hs.add(test.charAt(i));
			}
		}
		for (i = 0; i < h.size(); i++) {
			if (hs.contains(h.get(i)) && i < h.size()) {
				hs.remove(h.get(i));
			}
		}
//		for (i = 0; i < c; i++) {
//			
//			last.add(hs.get(i));
//		}
		
		System.out.println(hs);
		System.out.println(h);

	}

}