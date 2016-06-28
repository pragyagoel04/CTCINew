
public class MinimalBST {

	static Node root;

	public static void main(String[] args) {
		int a[] = { 2, 34, 45, 56, 67, 78, 89, 90 };
		ConstructTree(a);
		PrintTree(root);
	}

	public static void PrintTree(Node root) {
		if (root != null) {
			System.out.println(root.data);
			PrintTree(root.left);
			PrintTree(root.right);
		}
	}

	public static void ConstructTree(int[] a) {
		root = BuildTree(a, 0, a.length - 1);
	}

	public static Node BuildTree(int[] a, int start, int end) {
		if (start > end)
			return null;
		else {
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
		Node parent;

		Node(int data) {
			this.data = data;
		}
	}
}
