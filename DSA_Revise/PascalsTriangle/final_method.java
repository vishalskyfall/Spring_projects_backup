package PascalsTriangle;

public class final_method {
	public static void main(String[] args) {
		int n = 10;
		mat(n);

	}

	public static void mat(int n) {
		if(n==0)
		{
			System.out.println("0");
		}
		else if(n==1) {
			System.out.println("1");
		}
		else
		{
			for(int i=1;i<=n;i++) {
				for(int j=0;j<n-i;j++) {
					System.out.print(" "); // for left spaces  . . .
				}
				int c=1;
				for(int k=1;k<=i;k++) {
					System.out.print(c+" ");//right space as well
					c=c*(i-k)/k;//System.out.println("c:"+c+" K:"+k);
				}
				System.out.println();
			}
		}
	}
}
