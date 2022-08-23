package K_Rev_LinkedList;

class Node {
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	void print() {
		Node p = this;
		while (p != null) {
			System.out.print(p.data + " ->");
			p = p.next;
		}
		System.out.println(" ");
	}
}

public class final_method {

	public static void main(String[] args) {
		int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = reverseInGroups(head, 2);
		head.print();
	}
	
	static Node reverseInGroups(Node head, int k) {
		if(head==null) {
			return null;
		}
		Node current = head; //  initialize to head
		Node prev=null;
		int c=0;
		while(current!=null && c++<k) {
			Node next = current.next; 
			current.next=prev;
			prev=current;
//			System.out.println(prev.data);
			current=next;
		}
		head.next= reverseInGroups(current, k);
		return prev;
	}
}
