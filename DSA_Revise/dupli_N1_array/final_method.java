package dupli_N1_array;

import java.util.HashSet;

public class final_method {
	public static void main(String[] args) {
		int[] a = new int[] {3,1,3,4,2,2};
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			if(!h.add(a[i])) { // if add na thay to print karse kayo nathi because has doesn't allow duplis
				System.out.println(a[i]);
			}
		}
	}
}
