package LRU_Cache;

import java.util.HashMap;
import java.util.Map;

public class final_method {
	final Node head = new Node();
	final Node tail = new Node();
	Map<Integer, Node> node_map;
	int cache_capacity;

	static class Node {
		int key;
		int val;
		Node next;
		Node prev;

	}

	public final_method(int capacity) {
		node_map = new HashMap<>(capacity);
		this.cache_capacity = capacity;
		head.next = tail;
		tail.prev = head;
	}

	public void add(Node node) {
		Node head_next = node.next;
		head.next = node;
		node.prev = head;
		node.next = head_next;
		head_next.prev = node;
	}

	public void remove(Node node) {
		Node next_node = node.next;
		Node prev_node = node.prev;

		next_node.prev = prev_node;
		prev_node.next = next_node;
	}

	public int get(int key) {
		int res = -1;
		Node node = node_map.get(key);
		if (node != null) {
			res = node.val;
			remove(node);
			add(node);
		}
		return res;
	}

	public void put(int key, int val) {
		Node node = node_map.get(key);
		if (node != null) {
			remove(node);
			node.val = val;
			add(node);
		} else {
			if (node_map.size() == cache_capacity) {
				node_map.remove(tail.prev.key);
				remove(tail.prev);
			}
			Node newNode = new Node();
			newNode.key = key;
			newNode.val = val;

			node_map.put(key, newNode);
			add(newNode);
		}
	}

	public static void main(String[] args) {

	}
}
