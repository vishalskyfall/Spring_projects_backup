package search_2D_matrix;

import java.util.Scanner;

public class final_method {
	public static void main(String[] args) {
		int[][] m = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int low = 0;
		if (m.length == 0)
			System.out.println("False");
		;
		int r = m.length;
		int col = m[0].length;
		int high = (r * col) - 1;
System.out.println(r+" "+col+" "+high);
		while (low <= high) {
			int mid = (low + (high - low) / 2);
			System.out.println(mid);
			if (m[mid / col][mid % col] == n) {
				System.out.println("True");
			}
			if (m[mid / col][mid % col] < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println("False");

//        int c = 0;
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[0].length; j++) {
//				if (m[i][j] == n) {
//					System.out.println("True");
//					c++;
//					break;
//				} 
//			}
//		}
//		if (c == 0) {
//			System.out.println("False");
//		}
	}
}
