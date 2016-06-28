import java.util.Scanner;

public class Partition {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.addLast(45);
		ll.addLast(77);
		ll.addLast(11);
		ll.addLast(88);
		ll.addLast(34);
		ll.addLast(22);
		ll.addLast(4);
		ll.print();

		System.out.println("Enter value of n");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println();
		ll.head = partition(ll.head, n);
		ll.print();
		in.close();

	}

	public static ListNode partition(ListNode node, int n) {
		ListNode before = null;
		ListNode after = null;
		while (node != null) {
			ListNode next=node.next;
			if (node.data < n) {
				node.next = before;
				before = node;
			} else {
				node.next = after;
				after = node;
			}
			node = next;
		}
		if (before == null) {
			return after;
		}
		ListNode head = before;
		while (before.next != null) {
			before = before.next;
		}
		before.next = after;
		
		return head;

	}

	private static class ListNode {
		private int data;
		private ListNode next;
		//private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}
	}

	private static class LinkedList {
		//int size = 0;
		ListNode head = null;
		ListNode tail = null;

		public void addLast(int data) {
			if (head == null) {
				head = new ListNode(data);
				tail = head;
			} else {
				ListNode temp = new ListNode(data);
			//	temp.previous = tail;
				tail.next = temp;
				tail = tail.next;
			}

		}

		public void print() {
			ListNode temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
