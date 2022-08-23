package subsetSUM;

public class final_method {
	public static void main(String[] args) {
		int[] A = { 7, 3, 2, 5, 8, 1 };
		int k = 14;

		if (subsetSum(A, A.length - 1, k)) {
			System.out.print("Subsequence with the given sum exists");
		} else {
			System.out.print("Subsequence with the given sum does not exist");
		}
	}

	static boolean subsetSum(int[] a, int n, int k) {
		if (k == 0) {
			return true;
		}
		if (n < 0 || k < 0) {
			return false;
		}
//		System.out.println((n - 1) + " " + (k));
		boolean i = subsetSum(a, n - 1, k - a[n]);
		
		boolean j = subsetSum(a, n - 1, k);
		return i || j;
	}

}
