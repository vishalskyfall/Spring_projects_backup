package Rotate_Matrix;

import java.util.Arrays;

public class final_method {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } };

		rotate(mat);

		for (var r : mat) {
			System.out.println(Arrays.toString(r));
		}
}

public static void rotate(int[][] a) {
	if(a==null || a.length==0) {
		return;
	}
	int N=a.length; //transposing matrix
	for(int i=0;i<N;i++) {
		for(int j=0;j<i;j++) {
			int tem=a[i][j];
			a[i][j] = a[j][i];
			a[j][i]=tem;
			
		}
	}
	//swapping cols
	for(int i=0;i<N;i++) {
		for(int j=0;j<N/2;j++) {
			int tem=a[i][j];
			a[i][j]=a[i][N-j-1];
			a[i][N-j-1]=tem;
		}
	}
}
}
