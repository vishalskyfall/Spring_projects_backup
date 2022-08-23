package collections_2;

import java.util.List;
import java.util.PriorityQueue;

public class minCostRopes {
	public static void main(String[] args) {
		int[] a = new int[] { 5, 4, 2, 8 };
//		int sum = mincost(a);
//		System.out.println(sum);
	}

	static int mincost(List<Integer> a) {
		int cost = 0;
		PriorityQueue<Integer> pq= new PriorityQueue<>(a);
		while(pq.size()>1) {
			int x=pq.poll();
			int y=pq.poll();
			
			int sm = x+y;
			pq.add(sm);
			cost+=sm;
		}
		return cost;

	}
}
