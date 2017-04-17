

public class LinkedListCycle {


	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}


	public static void main(String args[]) {
		Node head  = new Node(10);
		head.next  = new Node(20);
		head.next.next = new Node(30);
		head.next.next = new Node(40);
		head.next.next.next = new Node(50);
		//head.next.next.next.next = head.next.next;
		System.out.println(isCycleExists(head));
	}

	static boolean isCycleExists(Node head) {
		Node slow = head;
		Node fast = head;

		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast) {
				return true;
			}
		}
		return false;
	}

}

