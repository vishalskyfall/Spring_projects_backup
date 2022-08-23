package postFix_Stack;

import java.util.Stack;

public class final_method {
	public static void main(String[] args) {
		String exp = "100 200 + 2 / 5 * 7 +";
		System.out.println(evaluatePostfix(exp));
	}

	static int evaluatePostfix(String s) {
		Stack<Integer> ss = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				continue;
			} else if (Character.isDigit(c)) {
				int n = 0;
				while (Character.isDigit(c)) {
					System.out.println((c - '0'));
					n = n * 10 + (int) (c - '0');
					i++;
					c = s.charAt(i);
				}
				i--;
				ss.push(n);
			} else {
				int val1 = ss.pop();
				int val2 = ss.pop();
				switch (c) {
				case '+':
					ss.push(val2 + val1);
					break;

				case '-':
					ss.push(val2 - val1);
					break;

				case '/':
					ss.push(val2 / val1);
					break;

				case '*':
					ss.push(val2 * val1);
					break;
				}

			}

		}
		return ss.pop();
	}
}
