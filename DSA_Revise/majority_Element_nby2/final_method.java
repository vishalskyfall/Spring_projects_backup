package majority_Element_nby2;

public class final_method {
	public static void main(String[] args) {
		int[] nums = new int[] { 4, 4,3,3,1,1,1,4,4,4,4};
//		int N = nums.length;
		int count = 0;
		int candidate = 0;

		for (int num : nums) { //jabardast logic dimag ma avyu because it's n/2
			if (count == 0) {
				candidate = num;
			}
			if (num == candidate)
				count += 1;
			else
				count -= 1;
		}

		System.out.println(candidate);
	}
}
