package Intersection_point_LL;

public class final_method {
	static Node head1, head2;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

	}

	public static void main(String[] args) {
		final_method list = new final_method();

		// creating first linked list 3 6 9 15 30
		list.head1 = new Node(3);
		list.head1.next = new Node(6);
		list.head1.next.next = new Node(10);
		list.head1.next.next.next = new Node(15);
		list.head1.next.next.next.next = new Node(30);

		// creating second linked list 10 15 30
		list.head2 = new Node(10);
		list.head2.next = new Node(15);
		list.head2.next.next = new Node(30);

		System.out.println("The node of intersection is " + list.getNode());
	}

	int getNode() {
		int c1 = getCount(head1);System.out.println(c1);
		int c2 = getCount(head2);System.out.println(c2);
		int d;
		if (c1 > c2) {
			d = c1 - c2;
			return _getIntersectionNode(d, head1, head2);
		} else {
			d = c2 - c1;
			return _getIntersectionNode(d, head2, head1);
		}
	}

	int getCount(Node n) {
		Node current = n;
		int c = 0;
		while (current != null) {
			c++;
			current = current.next;
		}
		return c;
	}

	int _getIntersectionNode(int d, Node h1, Node h2) {
		int i = 0;
		Node c1 = h1;
		Node c2 = h2;
		for (; i < d; i++) {
			if (c1 == null) {
				return -1;
			}
			c1 = c1.next;
		}
		while (c1 != null && c2 != null) {
			if (c1.data == c2.data) {
				return c1.data;
			}
			c1 = c1.next;
			c2 = c2.next;
		}
		return -1;

	}
}
