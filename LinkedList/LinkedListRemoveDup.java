

import java.util.HashSet;

public class LinkedListRemoveDup {

	Node head;

	class Node {

		int data;
		Node next = null;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(int data) {
		if(head == null) {
			head = new Node(data);
			head.next = null;
			return;
		}
		Node temp  = new Node(data);
		temp.next =  head;
		head = temp;
	}

	public void removeDups() {
		HashSet<Integer> set = new HashSet<Integer>();
		Node temp = head;
		Node prev = null;
                System.out.println("remove dups");
		while(temp != null) {
			System.out.println("inside loops");
			if(set.contains(temp.data)) {
				prev.next = temp.next;
			} else {
				set.add(temp.data);
				prev = temp;
			}
			temp = temp.next;
		}
		prev.next = null;
	}

	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}

	}

	public static void main(String args[]) {
		LinkedListRemoveDup list = new LinkedListRemoveDup();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(4);
		list.print();
		System.out.println();
		list.removeDups();
		list.print();
	}

}
