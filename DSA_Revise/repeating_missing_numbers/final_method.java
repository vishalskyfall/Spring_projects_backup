package repeating_missing_numbers;

import java.util.HashSet;

public class final_method {
	public static void main(String[] args) {
		int[] a = new int[] { 0,1};
		int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
		HashSet<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (i >= 0) {
				low = Math.min(low, a[i]);
//				System.out.println(low);
				high = Math.max(high, a[i]);
			}
			if (!h.add(a[i])) { // if add na thay to print karse kayo nathi because has doesn't allow duplis
				System.out.println(a[i]);
			}
		}
		if(!h.contains(high-low)) {
			System.out.println(high-low);
		}
		else if(!h.contains(high+low)) {
			System.out.println(high+low);
		}
		System.out.println(low + " " + high);

	}
}
