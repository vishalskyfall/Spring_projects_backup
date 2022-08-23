package Longest_subString_nonRepeating;

public class sliding_window {
	public static void main(String[] args) {
		String str = "abbcdafeegh";

		System.out.print(findLongestSubstring(str));
	}

//	private static final int CHAR_RANGE = 128;

	public static String findLongestSubstring(String str) {
		int CHAR_RANGE = 128;
		if (str == null || str.length() == 0) {
			return str;
		}
		boolean[] window = new boolean[CHAR_RANGE];
		int beg = 0, end = 0; // abbcdafeegh
		for (int low = 0, high = 0; high < str.length(); high++) {
			System.out.println("high:" + str.charAt(high) + " low:" + str.charAt(low));
//			System.out.println((window[str.charAt(high)]));
			if (window[str.charAt(high)]) {
				while (str.charAt(low) != str.charAt(high)) {
//					System.out.println("high:" + str.charAt(high) + " low:" + str.charAt(low));
					window[str.charAt(low)] = false;
					low++;
//					System.out.println("low in 1st:" + str.charAt(low));
				}
				low++;
			} else {
				window[str.charAt(high)] = true;
				if (end - beg < high - low) {
					beg = low;
					end = high;
					System.out.println(beg + " " + end);
				}
			}
		}

		return str.substring(beg, end + 1);

	}
}
