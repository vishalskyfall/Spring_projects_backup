package collections_2;

import java.util.ArrayList;

public class test4 {/*
					 * Write a function that takes integer array as input and returns new array of
					 * numbers that have repeated odd number of times Input -
					 * [2,2,3,1,9,9,9,1,2,2,2,3,2,2] will return [2,9]
					 */

	public static void main(String[] args) {
		int a[] = new int[] { 2,2,2,3};
		repeat_odd(a);
	}

	static void repeat_odd(int a[]) {
		int i = 0, c = 0;
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (; i < a.length; i++) {
			c=0;
//			if(b.)
			for (int j = i + 1; j < a.length; j++) {
				if (i <= a.length - 1) {
					if (a[i] == a[j]) {
						c++;
					}
					//System.out.println(c + " " + a[i]);

				}	
				if (c % 2 != 0 ) {
					System.out.println(i);
					b.add(a[i]);
					break;
				}
				
			}

		}
		System.out.println(b);

		// return a[];
	}
}
