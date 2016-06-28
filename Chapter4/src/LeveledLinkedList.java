import java.util.*;

public class LeveledLinkedList {

	static Node root;

	public static void main(String[] args) {
		int a[] = { 2, 34, 45, 56, 67, 78, 89, 90 };
		ConstructBST(a);
		printTree(root);
		ArrayList<LinkedList<Node>> LList = BFS();
		for (int i = 0; i < LList.size(); i++) {
			System.out.println(i + " " + LList.get(i).toString());
		}
	}

	static ArrayList<LinkedList<Node>> BFS() {
		ArrayList<LinkedList<Node>> LList = new ArrayList<>();
		if (root == null)
			return null;
		Node r = root;
		LinkedList<Node> current = new LinkedList<>();
		current.add(r);
		while (!current.isEmpty()) {
			LinkedList<Node> temp = current;
			LList.add(current);
			current = new LinkedList<>();
			for (Node child : temp) {
				if (child.left != null)
					current.add(child.left);
				if (child.right != null)
					current.add(child.right);
			}
		}
		return LList;
	}

	public static void printTree(Node root) {
		if (root != null) {
			System.out.println(root.data);
			printTree(root.left);
			printTree(root.right);
		}
	}

	public static void ConstructBST(int[] a) {
		root = BuildTree(a, 0, a.length - 1);
	}

	public static Node BuildTree(int[] a, int start, int end) {
		if (start > end) {
			return null;
		} else {
			int mid = (start + end) / 2;
			Node n = new Node(a[mid]);
			n.left = BuildTree(a, start, mid - 1);
			n.right = BuildTree(a, mid + 1, end);
			return n;
		}
	}

	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}

		public String toString() {
			return "" + data;
		}
	}
}
