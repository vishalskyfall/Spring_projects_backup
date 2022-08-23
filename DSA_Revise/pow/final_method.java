package pow;

public class final_method {
	public static void main(String[] args) {
		int n = 3;
		double x = 2.10000;
		double ans = 1.0;
		long number = n;
		if (number < 0) {
			number = -1 * number;
		}
		while (number > 0) {
			if (number % 2 == 1) {
				ans = ans * x;
				number--;
			} else {
				x = x * x;
				number = number / 2;
			}
		}
		if (n < 0) {
			ans = (double) (1.0) / (double) (ans);
		}
			System.out.println(ans);
		
	}
}
