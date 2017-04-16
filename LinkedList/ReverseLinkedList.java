


public class ReverseLinkedList {

	Node head;

	class Node {

		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void add(int data) {
		if(head == null) {
			head = new Node(data);
			head.next = null;
			return;
		}
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}

	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	void reverse() {
		Node temp = head;
		Node newlist = null;

		while(temp != null) {
			Node newNode = new Node(temp.data);
			if(newlist == null) {
				newNode.next = null;
				newlist = newNode;
			} else {
				newNode.next = newlist;
				newlist = newNode;
			}
			temp = temp.next;
		}
		head = newlist;
	}

	public static void main(String args[]) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
		System.out.println();
		list.reverse();
		System.out.println();
		list.print();
		System.out.println();
		list.reverse();
		list.print();
	}
}
