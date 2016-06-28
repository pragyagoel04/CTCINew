//import java.util.*;

public class CheckBalancedTress {
	static Node root;
	static int depth=0;
	// private static Node root2;

	public static void main(String[] args) {
		Node root = null;
		int array[] = { 13, 4, 6, 79, 63, 3, 16, 7, 20, 5, 21 };
		// System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			root = initRoot(root, array[i]);
		}
		printTree(root);

		if (isBalanced(root)) {
			System.out.println("Tree is balanced!");
		} else {
			System.out.println("Tree is not balanced!");
		}

	}

	public static boolean isBalanced(Node root) {
		if (root == null)
			return true;
		getDepth(root);

		return false;

	}

	public static void getDepth(Node root) {
		if(root==null)
			return;
		++depth;
		if(root.left==null && root.right==null){
			
		}
		--depth;		//depth is the number of edges from root to leaf
	}

	public static Node initRoot(Node root, int data) {

		// root2 = root;
		if (root == null) {
			root = new Node();

			root.data = data;
			root.left = null;
			root.right = null;
			root.parent = null;
			return root;
		} else {
			return CheckBalancedTress.initNode(root, null, data);
		}
	}

	public static Node initNode(Node node, Node parent, int data) {
		if (node == null) {
			node = new Node();
			node.data = data;
			node.parent = parent;
			return node;
		}
		if (data < node.data) {
			node.left = initNode(node.left, node, data);
		} else {
			node.right = initNode(node.right, node, data);
		}
		return node;
	}

	public static void printTree(Node root) {
		if (root != null) {
			System.out.println(root.data);
			printTree(root.left);
			printTree(root.right);
		}
	}

	public static class Node {
		public int data;
		public Node left;
		public Node right;
		public Node parent;

		Node() {
		}

		Node(int data) {
			this.data = data;
		}

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

		public void setLeftChild(Node left) {
			this.left = left;
			if (left != null)
				left.parent = this;
		}

		public void setRightChild(Node right) {
			this.right = right;
			if (right != null)
				right.parent = this;
		}
	}
}
