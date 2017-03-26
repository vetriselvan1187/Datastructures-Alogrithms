
import java.util.*;

public class GraphDriver {
	public static void main(String args[]) {
		GraphNode n1 = new GraphNode(1);
		GraphNode n2 = new GraphNode(2);
		GraphNode n3 = new GraphNode(3);
		GraphNode n4 = new GraphNode(4);
		GraphNode n5 = new GraphNode(5);
		GraphNode n6 = new GraphNode(6);
		GraphNode n7 = new GraphNode(7);

		n1.neighbours = new GraphNode[] {n2, n4, n5};
		n2.neighbours = new GraphNode[] {n1, n3, n4};
		n3.neighbours = new GraphNode[] {n2, n4, n7};
		n4.neighbours = new GraphNode[] {n1, n2, n3, n5, n6, n7};
		n5.neighbours = new GraphNode[] {n1, n4, n6};
		n6.neighbours = new GraphNode[] {n4, n5, n7};
		n7.neighbours = new GraphNode[] {n3, n4, n6};
		BFS(n1);
		DFS(n1);
	}

	public static void BFS(GraphNode node) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		node.visited = true;
		queue.add(node);

		System.out.println(node.value);
		while(!queue.isEmpty()) {
			GraphNode v = queue.poll();
			for(GraphNode w : v.neighbours) {
				if(!w.visited) {
					w.visited = true;
					System.out.println(w.value);
					queue.add(w);
				}
			}
		}
	}

	public static void DFS(GraphNode node) {
		Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.push(node);
		System.out.println(node.value);
		node.visited = true;
		while(!stack.isEmpty()) {
			GraphNode s = stack.pop();
			for(GraphNode w : s.neighbours) {
				if(!w.visited) {
					stack.push(w);
					w.visited = true;
					System.out.println(w.value);
				}
			}
		}
	}
}
