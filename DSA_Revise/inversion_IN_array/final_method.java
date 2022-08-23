package inversion_IN_array;

/*Explanation: we have a reverse sorted array and we will 
get the maximum inversions as for i < j we will always 
find a pair such that A[j] < A[i]. 
Example: 5 has index 0 and 3 has index 2 now (5,3) pair 
is inversion as 0 < 2 and 5 > 3 which will satisfy out 
conditions and for reverse sorted array we will get 
maximum inversions and that is (n)*(n-1) / 2.

For above given array there is 4 + 3 + 2 + 1 = 10 inversions.*/
public class final_method {
	public static void main(String[] args) {
		int[] a = new int[] { 8, 4, 2, 1 };
		/*
		 * Explanation: Given array has six inversions: (8, 4), (4, 2), (8, 2), (8, 1),
		 * (4, 1), (2, 1).
		 */		int inv_count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					inv_count++;
				}
			}
		}
		System.out.println(inv_count);
	}
}
