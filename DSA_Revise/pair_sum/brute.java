package pair_sum;

public class brute {
	public static void main(String[] args) {
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		findPair(nums, target);
	}

	static void findPair(int nums[], int t) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == t) {
					System.out.println("Pair found : (" + nums[i] + "," + nums[j] + ")");
//					return;
				}
			}
		}
	}
}
