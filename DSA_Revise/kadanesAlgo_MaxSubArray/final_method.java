package kadanesAlgo_MaxSubArray;

import java.util.ArrayList;

public class final_method {
	public static void main(String[] args) {
		int[] a = new int[] { 2, 3,-100, -1, 4, -10 ,50}; // {2 , 3}
		int sum = max(a);
		System.out.println(sum);
	}

	static int max(int[] a) {
		int maxsum = Integer.MIN_VALUE;
		int current = 0;
		int p = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			current += a[i];
//			System.out.println("current : "+current);

			if (current > maxsum) { // -2<-1
				maxsum = current;
				al.add(i);
//				System.out.println(i);
			}
			if (current < 0 && current > maxsum) {
				al.remove(al.size() - 1);
			}
			if (current < 0) {
				current = 0;
			}

		}

		System.out.println(al.toString());
		return maxsum;
	}
}
