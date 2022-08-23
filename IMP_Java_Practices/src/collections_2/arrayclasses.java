package collections_2;

import java.util.Arrays;

public class arrayclasses {
public static void main(String[] args) {
	
	int[] nums = {1,2,3,4,5,6,7,8,9};
	int i = Arrays.binarySearch(nums, 4);
	System.out.println(i);
	Arrays.sort(nums); //quick sort use thay so joi levu concept
	Arrays.fill(nums,12); //dynamic problem ma kam ave
	for(int ii:nums) {
		System.out.println(ii);
	}
	//collection max min frequency sort comparator.reverse
}
}
