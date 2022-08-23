package a_Majority_EleM;

import java.util.HashMap;

public class final_method {

	public static void main(String[] args) {

		int nums[] = new int[] { 2};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		HashMap<Integer, Integer> hp = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hp.containsKey(nums[i])) {
				int count = hp.get(nums[i]) + 1;
				if (count > nums.length / 2) {
//				 System.out.println("Majority Element found : "+nums[i]);
					return nums[i];
				} else {
					hp.put(nums[i], count);
					System.out.println(count + " " + nums[i]);
				}
			} else {
				hp.put(nums[i], 1);
				System.out.println(nums[i]);
			}
		}
		return 0;
	}

}
