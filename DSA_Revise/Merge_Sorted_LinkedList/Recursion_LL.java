package Merge_Sorted_LinkedList;

class Node {
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

public class Recursion_LL {

	public static void printList(String s, Node head) {
		System.out.println(s);
		Node p = head;
		while (p != null) {
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		System.out.println(" bas bhai thai gayu	");
	}

	public static Node sortedMerge(Node a, Node b) {
		Node res;
		// base cases
        if (a == null) {
            return b;
        }
        else if (b == null) {
            return a;
        }
        	
        if(a.data<b.data) {
        	res=a;
        	res.next=sortedMerge(a.next, b);
        }
        else {
        	res=b;
        	res.next=sortedMerge(a, b.next);
        }
		return res;
	}

	public static void main(String[] args) {
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7 };

		Node a = null, b = null;
		for (int i = keys.length - 1; i >= 0; i = i - 2) {
			a = new Node(keys[i], a);
		}

		for (int i = keys.length - 2; i >= 0; i = i - 2) {
			b = new Node(keys[i], b);
		}

		// print both lists
		printList("First List: ", a);
		printList("Second List: ", b);

		Node head = sortedMerge(a, b);
		printList("After Merge: ", head);
	}
}
