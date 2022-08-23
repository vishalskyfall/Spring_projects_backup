package collections_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class priorityQ {
	public static void main(String[] args) {

		PriorityQueue<Integer> q = new PriorityQueue<>(); //here to change priority
		q.add(1);
		q.add(4); // use offer as it doesnt throw exception not to use add plzz
		q.add(5);
		q.add(2);
		q.add(3);
		System.out.println(q); // heap type 6 nano element pela jay 
		
		System.out.println(q.poll()); // first in first out & and value jeni nani 6 e
		//poll ma same element ma throw karse jo malse nai to
		System.out.println(q.peek() + "  " + q); // same element ma throw karse jo malse nai to
//		int[] arr = {10, 9, 8, 7, 5, 70, 60, 50};
//		List<Integer> al =Arrays.asList(10, 9, 8, 7, 5, 70, 60, 50);
//        //System.out.println(Arrays.toString(arr));
//        priorityQ.sortKSortedArray(al, 4);
//        System.out.println(Arrays.toString(arr));
		
		
		
	}
	public static void sortKSortedArray(List<Integer> nums, int k)
	{
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int length = nums.size();
		for(int i=0;i<k;i++){
			minHeap.add(nums.get(i));
		}
		int index =0;
		for(int i=k;i<length;i++){
			minHeap.add(nums.get(i));
			//System.out.println(minHeap.poll());
			 nums.set(index,minHeap.poll());
			++index;
		}
		while(minHeap.iterator().hasNext()){
			//System.out.println(minHeap.poll());
			 nums.set(index,minHeap.poll());
			++index;
		}
		
		for(int i=0;i<nums.size();i++){
			System.out.println(nums.get(i));
		}
	}
}
