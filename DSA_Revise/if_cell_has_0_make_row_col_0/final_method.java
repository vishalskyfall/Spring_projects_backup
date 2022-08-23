package if_cell_has_0_make_row_col_0;

import java.util.Arrays;

public class final_method {
	public static void main(String[] args) {
		int[][] mat = { { 1, 1, 0, 1, 1 }, 
				{ 1, 1, 1, 1, 1 }, 
				{ 1, 1, 1, 0, 1 }, 
				{ 1, 1, 1, 1, 1 }, 
				{ 0, 1, 1, 1, 1 } };

		// convert the matrix
		convert(mat);

		// print matrix
		for (var r : mat) {
			System.out.println(Arrays.toString(r));
		}
	}

	public static void convert(int[][] a) {
		if (a == null || a.length == 0) {
			return;
		}
		int M = a.length; // row
		int N = a[0].length; // col

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (a[i][j] == 0) {
					System.out.println("zeros : "+i+" "+j);
					// changing non-zero element in row i and col j to -1
					chnageRowCol(a, M, N, i, j);
					
				}
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(a[i][j]==-1) {
					a[i][j]=0;
				}
			}
		}

	}

	static void chnageRowCol(int[][] a, int M, int N, int i, int j) {
		for(int k=0;k<N;k++) {	
		
			if(a[i][k]!=0) {
				a[i][k]=-1; 
				// N is col so j will be placed at 2nd like [x][j]
			}
		}
		for(int k=0;k<M;k++) {
			if(a[k][j]!=0) {
				a[k][j]=-1; // M is row so i will be placed at 1st like [i][y]
			}
		}
	}
}
