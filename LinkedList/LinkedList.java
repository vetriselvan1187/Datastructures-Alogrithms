

public class LinkedList {

	Node head;

	class Node  {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}


	public void add(int data) {
		if(head == null) {
			head = new Node(data);
			head.next = null;
			return ;
		}
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}


	public void delete(int pos) {
		if(head == null) {
			return;
		}
		Node temp = head;
		if(pos == 0) {
			head = temp.next;
			return;
		}

		for(int i=0; i < pos-1 && temp != null ; i++) {
			temp = temp.next;
		}
		if(temp == null || temp.next == null) {
			return;
		}
		temp.next = temp.next.next;

	}


	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	public void print(int offset) {
		Node temp = head;
		int pos = 0;
		while(temp != null) {
			if(pos < offset) {
				pos++;
			} else {
				System.out.print(temp.data+" ");
			}
			temp = temp.next;
		}
	}

	public void reversePrint() {
		reverse(head);
	}

	public void reverse(Node temp) {
		if(temp == null) {
			return;
		}
		reverse(temp.next);
		System.out.print(temp.data+" ");
	}

	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.print();
		System.out.println();
		list.print(2);
		System.out.println();
		list.reversePrint();
	}



}
