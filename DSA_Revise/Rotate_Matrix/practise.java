package Rotate_Matrix;

import java.util.Arrays;

public class practise {
	public static void main(String[] args) {

		rotate(new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } });
	}

	public static void rotate(int[][] matrix) {
//		System.out.println(matrix[3][1]);
		int[][] B = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				B[j][matrix.length - i - 1] = matrix[i][j];
//				System.out.println("b[j][mat-i-1]" + j + " " + (matrix.length - i - 1));
				// 0 3 (j i) ma chhe ene i j (3,0) = 15 ;
				// 3 1 =
			}
		}
		String s = "";
		s += "[";
		for (int i = 0; i < matrix.length; i++) {
			s += Arrays.toString(B[i]);
			if (i != matrix.length - 1) {
				s += ",";
			}
		}
		s += "]";
		s = s.replaceAll(" ", "");
		System.out.print(s);
	}
}
