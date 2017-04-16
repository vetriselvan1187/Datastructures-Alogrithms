

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


	public void printList() {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.printList();
	}



}
