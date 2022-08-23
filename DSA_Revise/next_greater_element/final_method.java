package next_greater_element;

import java.util.Stack;

public class final_method {
	static int a[] = { 2, 5, 4, 25 };

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		int newa[] = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			if (!s.empty()) {
				while (!s.empty() && s.peek() <= a[i]) {
					s.pop();  // above line is main logic
				}
			}
			newa[i] = s.empty() ? -1 : s.peek();
			s.push(a[i]);
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i] + " --> " + newa[i]);
	}
}
