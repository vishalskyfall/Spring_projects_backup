package Next_Permutation;

import java.util.Arrays;

public class final_method {
	public static void main(String[] args) {
		nextPermutation(new int[] { 1, 2, 0, 5, 0 });
		nextPermutation(new int[] { 1, 3, 2 });

	}

	public static void nextPermutation(int[] nums) {
		int mark = -1;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				mark = i - 1;
//				System.out.println("mark : " + mark + ", i : " + i);
				break;
			}
		}

		if (mark == -1) {
			reverse(nums, 0, nums.length - 1);
			System.out.println(Arrays.toString(nums));
			return;
		}
//		swap(nums, mark, mark + 1);

		int idx = nums.length - 1;
		for (int i = nums.length - 1; i >= mark + 1; i--) {
			if (nums[i] > nums[mark]) {
				idx = i;
				swap(nums, mark, i);
				break;
			}
		}
		reverse(nums, mark + 1, nums.length - 1);
//		System.out.println(Arrays.toString(nums));

	}

//	    System.out.println(Arrays.toString(nums));



	static void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

	static void reverse(int[] nums, int i, int j) {
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}

	}
}
