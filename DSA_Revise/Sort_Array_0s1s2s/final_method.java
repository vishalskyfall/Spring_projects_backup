package Sort_Array_0s1s2s;

import java.util.Arrays;

public class final_method {
	public static void main(String[] args) {
		int[] a = new int[] { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		long s = System.nanoTime();
		Arrays.sort(a);
		long l = System.nanoTime();
		System.out.println(l - s);
		sort(a, a.length);
		long ll = System.nanoTime();
		System.out.println(ll - l);
		for (var sum : a) {
			System.out.print(sum);
		}
	}

	public static void sort(int[] a, int arr_size) {
		int start = 0;
		int end = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= end) {
			switch (a[mid]) {
			case 0: {
				temp = a[start];
				a[start] = a[mid];
				a[mid] = temp;
				start++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = a[mid];
				a[mid] = a[end];
				a[end] = temp;
				end--;
				break;
			}
			}
		}

	}
}
