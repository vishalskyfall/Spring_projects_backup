package pair_sum;

import java.util.HashMap;
import java.util.Map;

public class hash {
	public static void main(String[] args) {
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		findPair(nums, target);
	}

	static void findPair(int nums[], int t) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			// check if pair (nums[i], target-nums[i]) exists
			if (m.containsKey(t - nums[i])) {
				System.out.printf("Pair found (%d, %d)\n", nums[m.get(t - nums[i])], nums[i]);
				//return;
				// above , m.get(t-nums[i]) will return index like 0 means nums[0] = 8
			}
			m.put(nums[i], i);
		}
	}
}
