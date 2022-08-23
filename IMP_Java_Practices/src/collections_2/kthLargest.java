package collections_2;

import java.util.Arrays;
import java.util.Collections;

public class kthLargest {
public static void main(String[] args) {
	int[] a = new int[] {1, 5, 2, 2, 2, 5, 5, 4};
	int k=4;
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
Collections.sort(null);
	System.out.println(" kth : "+a[a.length-k]);
}

}
