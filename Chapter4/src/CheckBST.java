/*
 * 				9
 * 		5				11
 * 4		6		10		15
 */
public class CheckBST {
	static Node root;
	
	public static void main(String[] args) {
		root=new Node(9);
		root.Left= new Node(5);
		root.Left.Left=new Node(4);
		root.Left.right=new Node(6);
		root.right= new Node(11);
		root.right.Left=new Node(10);
		root.right.right=new Node(15);
		System.out.println(IsBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
		
		
	}
	
	public static boolean IsBST(Node node, int min, int max){
		if(node==null){
			return true;
		}
		if(node.data<=min || node.data>max){
			return false;
		}
		if(!IsBST(node.Left, min,node.data) || !IsBST(node.right, node.data, max)){
			return false;
		}
		else
			return true;
	}
	public static class Node{
		int data;
		Node right;
		Node Left;
		
		Node(int data){
			this.data=data;
		}
	}
}
