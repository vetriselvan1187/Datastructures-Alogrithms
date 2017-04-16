
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class BSTLevelOrderTraversal {
	public static void main(String args[]) {
		Node root = new Node(50);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(2);
		root.left.right = new Node(25);
		root.right.left = new Node(70);
		root.right.right = new Node(150);
		BSTLevelOrderTraversal bstLevel = new BSTLevelOrderTraversal();
		bstLevel.levelOrderTraversal(root);
		System.out.println();
		bstLevel.reverseLevelOrderTraversal(root);
	        	
	}

	void levelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedList();
		queue.offer(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.data+" ");
			if(node.left != null) {
				queue.offer(node.left);
			}
			if(node.right != null) {
				queue.offer(node.right);
			}
		}
	}

	void reverseLevelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedList();
		Stack<Node> stack = new Stack<Node>();
		queue.offer(root);

		while(!queue.isEmpty()) {
			Node node = queue.poll();
			stack.push(node);
			if(node.left != null) {
				queue.offer(node.left);
			}
			if(node.right != null) {
				queue.offer(node.right);
			}
		}
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.print(node.data +" ");

		}
	}
}
