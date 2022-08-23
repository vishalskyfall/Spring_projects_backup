package anagram_hash;

import java.util.HashMap;
import java.util.Map;

public class final_method {
	public static void main(String[] args) {
		String X = "vishaloo"; // Tom Marvolo Riddle
		String Y = "loovisha"; // I am Lord Voldemort

		if (isAnagram(X, Y)) {
			System.out.print("Anagram");
		} else {
			System.out.print("Not an Anagram");
		}
	}

	static boolean isAnagram(String x, String y) {
		if (x.length() != y.length()) {
			return false;
		}
		Map<Character, Integer> mX = new HashMap<Character, Integer>();
		for (char c : x.toCharArray()) {
			mX.put(c, mX.getOrDefault(c, 0)+1);
			System.out.println(mX.toString());
		}

		Map<Character, Integer> mY = new HashMap<Character, Integer>();
		for (char c : y.toCharArray()) {
			mY.put(c, mY.getOrDefault(c, 0)+1);
		}

		return mX.equals(mY);
	}
}
