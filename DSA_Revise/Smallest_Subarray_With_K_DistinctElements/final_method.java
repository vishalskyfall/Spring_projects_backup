package Smallest_Subarray_With_K_DistinctElements;

import java.util.HashSet;

//
//Given Array element
//9 1 2 2 -2 2 -3 -3 4 -5 5
//Smallest subarray of size k = 3 is
// -3  4  -5
public class final_method {
	public static void main(String[] args) {
		final_method task = new final_method();
		int[] arr = { 9, 1, 2, 2, -2, 2, -3, -3, 4, -5, 5 };
		int n = arr.length;
		int k = 3;
		task.kDistinctSmallArray(arr, n, k);
	}

	public void printArray(int[] arr, int n) {
		for (int i = 0; i < n; ++i) {
			System.out.print(" " + arr[i]);
		}
	}

	public void kDistinctSmallArray(int[] a, int n, int k) {
		if (k < 0 || k > n) {
			return;
		}
		int sum = 0;
		HashSet<Integer> task = new HashSet<Integer>();
		int result = Integer.MAX_VALUE;
		int start = -1;

		for (int i = 0; i < n; i++) {
			if (task.contains(a[i])) {
				task.clear();
				sum = 0;// sum making 0    9, 1, 2, 2, -2, 2, -3, -3, 4, -5, 5 
				System.out.println("sum:"+sum);
			}
			if (task.size() < k) {
				task.add(a[i]);
				sum += a[i];
				System.out.println("<k sum:"+sum);
			}
			if (task.size() == k) {
				if (result > sum) {
					result = sum;
					start = (i + 1) - k; 
					System.out.println("start:"+start);
				}
				// For next iteration
				task.remove(a[(i + 1) - k]);

				sum -= a[(i + 1) - k];
			}
		} /*
			 * 
			 * just for print no dsa
			 */
		System.out.println("start:"+start+" sum:"+sum);
		System.out.print("\n Given Array element \n");
		this.printArray(a, n);
		System.out.print("\n Smallest subarray of size k = " + k + " is \n");
		if (start == -1) {
			System.out.println("/nNone");
		} else {
			sum = k + start; // form to i = 7 to 10 it'll print
			while (start < sum) {
				System.out.println(" " + a[start]);
				start++;
			}
		}
	}

}
