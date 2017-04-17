
public class TreeSize {

	public static void main(String args[]) {
		TreeSize ts = new TreeSize();
		Node root = new Node(50);
		root.left = new Node(20);
		root.right = new Node(100);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right.left = new Node(70);
		root.right.right = new Node(120);
		System.out.println(ts.size(root));

	}

	int size(Node root) {
		if(root == null) {
			return 0;
		}

		return size(root.left) + size(root.right) + 1;

	}

}
