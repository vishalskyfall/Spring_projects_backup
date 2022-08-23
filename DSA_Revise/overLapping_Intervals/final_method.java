package overLapping_Intervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

//Input:  {1, 5}, {2, 3}, {4, 6}, {7, 8}, {8, 10}, {12, 15}
//
//Output: Intervals after merging overlapping intervals are {1, 6}, {7, 10}, {12, 15}.
class Interval {

	int beg, end;

	Interval(int beg, int end) {
		this.beg = beg;
		this.end = end;
	}

	@Override
	public String toString() {
		return "{" + beg + ", " + end + "}";
	}
}

public class final_method {
	public static void main(String[] args) {
		List<Interval> intervals = Arrays.asList(new Interval(1, 5), 
				new Interval(2, 3), 
				new Interval(4, 6),
				new Interval(7, 8), 
				new Interval(8, 10), 
				new Interval(12, 15));

		mergeIntervals(intervals);
	}

	static void mergeIntervals(List<Interval> i) {
		// sort with intervals as a.beg
		Collections.sort(i, Comparator.comparingInt(a -> a.beg));
		//sorted now with beg
		
		Stack<Interval> s = new Stack<>();
		for(Interval it : i) {
			if(s.empty() || it.beg>s.peek().end) { //current is coming from list and check with stack
				s.push(it);                    // current stack which we're adding just think and gokho
			}
			
			if(s.peek().end<it.end) {
				s.peek().end=it.end;
			}
		}
		
		while(!s.empty()) {
			System.out.println(s.pop());
		}
		
	}

}
