package collections_2;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		q.offer(34); // use offer as it doesnt throw exception not to use add plzz
		q.offer(46);
		q.offer(93);
		System.out.println(q);
		System.out.println(q.poll()); // first in first out & 
		//poll ma same element ma throw karse jo malse nai to
		System.out.println(q.peek() + "  " + q); // same element ma throw karse jo malse nai to
	}
}
