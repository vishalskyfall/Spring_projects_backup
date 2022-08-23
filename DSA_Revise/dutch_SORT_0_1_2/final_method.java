package dutch_SORT_0_1_2;

import java.util.Arrays;

public class final_method {
	public static void main(String[] args) {
		int[] A = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
//		long start = System.nanoTime();
		threeWayPartition(A);
//		threeWayPartitions(A);
//		long end = System.nanoTime();
		System.out.println(Arrays.toString(A));
	}

//	static void threeWayPartitions(int[] a) {
//		Arrays.sort(a);
//	}
	  public static void threeWayPartition(int[] A)
	    {
	        int start = 0, mid = 0;
	        int pivot = 1;
	        int end = A.length - 1;  //0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 
	        int c=0;
	        while (mid <= end)
	        { 
	            if (A[mid] < pivot)         // current element is 0
	            {
//	                System.out.println("before "+A[start]+" "+A[mid]+" & "+A[mid]+"<="+A[pivot]);
	                swap(A, start, mid);
	                ++start;
	                ++mid;
	                System.out.println("A[mid] < pivot |  Start:"+A[start]+" Mid:"+A[mid]+" End:"+A[end]+"count"+c);
	                System.out.println(Arrays.toString(A));
	                c++;
	            }
	            else if (A[mid] > pivot)    // current element is 2
	            {
	                swap(A, mid, end);
	                --end;
	                System.out.println(" A[mid] > pivot | Start:"+A[start]+" Mid:"+A[mid]+" End:"+A[end]+"count"+c);
	                System.out.println(Arrays.toString(A));
	                c++;
	            }
	            else {                      // current element is 1
	                ++mid;
	                System.out.println("else | Start:"+A[start]+" Mid:"+A[mid]+" End:"+A[end]+"count"+c);
	                System.out.println(Arrays.toString(A));
	                c++;
	            }

	        }
	    }
	 
	    // Utility function to swap elements `A[i]` and `A[j]` in the array
	    private static void swap(int[] A, int i, int j)
	    {
	        int temp = A[i];
	        A[i] = A[j];
	        A[j] = temp;
	    }
	 
}
