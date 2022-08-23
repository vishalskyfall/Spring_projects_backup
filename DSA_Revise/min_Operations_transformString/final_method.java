package min_Operations_transformString;

public class final_method {
	public static void main(String[] args) {

		String first = "vishlass";
		String second = "vishalss";
		if (isTransformable(first.toCharArray(), second.toCharArray())) {
			System.out.println(getMinimumOperations(first, second));
		} else {
			System.out.println("The string cannot be transformed");
		}

	}

	static int getMinimumOperations(String f, String s) {
		int count = 0;
		for (int i = f.length() - 1, j = i; i >= 0; i--, j--) {
			System.out.println("outside:" + f.charAt(i) + "" + s.charAt(j));

			while (i >= 0 && f.charAt(i) != s.charAt(j)) {
				System.out.println(f.charAt(i) + "" + s.charAt(j));
				i--;
				count++;
			}
		}
		return count;
	}

	public static boolean isTransformable(char[] first, char[] second) {
		// base case
		if (first == null || second == null) {
			return false;
		}

		// if the length of both strings differs
		if (first.length != second.length) {
			return false;
		}
		return true;

		// return true if both strings have the same set of characters
//	        return getFrequencyMap(first).equals(getFrequencyMap(second));
	}

	// Utility function to create a frequency map
//	    public static Map<Character, Long> getFrequencyMap(char[] chars)
//	    {
//	        return new String(chars).chars().mapToObj(ch -> (char) ch)
//	                .collect(Collectors.groupingBy(Function.identity(),
//	                    Collectors.counting()));
//	    }
}
