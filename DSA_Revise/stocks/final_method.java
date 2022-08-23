package stocks;

public class final_method {
	public static void main(String[] args) {
		int[] a = new int[] { 7, 1, 5, 3, 6, 4 };
		int sum = Total_profit(a);
//		System.out.println(sum);
//		System.out.println("Max Profit : " + maxProf(a));
		System.out.println("Max Profit Leet : " + maxProfit(a));
	}

	static int Total_profit(int[] a) {
		int p = 0, current = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				p = (a[i] - a[i - 1]);
//				System.out.println("p: "+p);
				if (p > current) {
					current = p;
				}
			}
		}
		return p;
	}

	static int maxProf(int[] a) {
		int p = 0, current = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) { // i+1 imp logic
				if (a[j] > a[i]) {
//					System.out.println(a[j]+" "+j+" "+i+" "+a[i]);
					p = (a[j] - a[i]);
					if (p > current) {
						current = p;
					}
				}
			}
		}
		return current;
	}

	public static int maxProfit(int[] prices) { //7,1,5,3,6,4
		int i = 0;
		int j = 0;
		int maxProfit = 0;
		while (j < prices.length) {
			System.out.println(i+" "+j);
			if (prices[i] > prices[j]) {
				i = j;
			} else {
				maxProfit = Math.max(prices[j] - prices[i], maxProfit);
				System.out.println(maxProfit);
				j++;
			}
		}
		return maxProfit;
	}
}
