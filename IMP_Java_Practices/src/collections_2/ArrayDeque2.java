package collections_2;

import java.util.ArrayDeque;

public class ArrayDeque2 {
	public static void main(String[] args) {

		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.offer("A");
//		ad.offerFirst(1);
//		ad.offerLast(100);
		ad.offer("A");
		
		System.out.println(ad);
		//poll pollfirst last and peek peekfirst & last
	}
}
