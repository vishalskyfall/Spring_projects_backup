package setMetrixZero;

import java.util.Arrays;

public class final_method {
	public static void main(String[] args) {
		int[][] mat = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 },{0,1,1} };
		for (var r : mat) {
			System.out.println("before : "+Arrays.toString(r));
		}
		convert(mat);
		for (var r : mat) {
			System.out.println(Arrays.toString(r));
		}
	}

	public static void convert(int[][] a) {
		if (a == null || a.length == 0) {
			return;
		}
		int M = a.length; // col length
//		System.out.println(M);
		int N = a[0].length; //row
//		System.out.println(N);
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (a[i][j] == 0) {
					changeRowCol(a, M, N, i, j); // i and j change thase
				}
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (a[i][j] == -1) {
					a[i][j] = 0;
				}
			}
		}
	}

	public static void changeRowCol(int[][] a, int M, int N, int i, int j) {
		
		for(int k=0;k<N;k++) {
//			System.out.println("a[i][k] : "+i+" "+k);   //
			if(a[i][k]!=0) {
				a[i][k]=-1;
			}
		}
		for(int k=0;k<M;k++) {
//			System.out.println("a[k][j] : "+k+" "+j);
			if(a[k][j]!=0) {
				a[k][j]=-1;
			}
		}
	}
}
