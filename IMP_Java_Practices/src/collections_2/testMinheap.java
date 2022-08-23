package collections_2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class testMinheap {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>(); // here to change priority
		int[] a = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			q.add(a[i]);
		}

		System.out.println(q);
		System.out.println(check(a));
	}

	public static boolean check(int[] x) {
		if (x == null) { // check whether the arr is null itself, not the element
			return false; // here we assume null is not a heap (open for discussion)
		}
		for (int i = 1; i < x.length; i++) {
			if (x[i] < x[(i - 1) / 2]) { // the node is less than its parent
				System.out.println(x[(i-1)/2]);
				return false; // we know there is an error, so return false
			}
			System.out.println(x[i]+" "+x[(i-1)/2]);
		}
		return true; // all checks succeeded, return true
	}
}
