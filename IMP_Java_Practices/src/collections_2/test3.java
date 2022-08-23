package collections_2;

import java.util.Scanner;

public class test3 {
	/*
	 * Write a Java funtion that takes integer as input parameter and returns true
	 * or false. It returns True if the given input number is divisible by 2 or 3
	 * but not both. In all other cases return false
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println(check(k));
	}

	static boolean check(int k) {
		
		if(k%6!=0) {
			if(k%2==0 ||  k%3==0 ) {
				
				return true;
			}
			else
				return false;
		}
		return false;
	}
}
