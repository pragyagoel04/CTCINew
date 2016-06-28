
import java.util.Hashtable;

public class RemoveDuplicates {
	public static void main(String args[]) {

		LinkedList ll = new LinkedList();
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(1);
		ll.addLast(1);
		ll.addLast(7);
		ll.addLast(9);
		ll.addLast(0);

		System.out.println("Before removal of duplicates: ");
		ll.print();
		RemDupsWithBuffer(ll.head);
		ll.print();
		// RemDupsNoBuffer(head);

	}

	public static void RemDupsWithBuffer(ListNode head) {
		Hashtable<ListNode, Boolean> table = new Hashtable<ListNode, Boolean>();
		ListNode previous = null;
		while (head != null) {
			if (table.containsKey(head.data)) {
				previous.next = head.next;
			} else {
				table.put(head, true);
				previous = head;
			}
			head = head.next;
		}
		return;

	}

	public static void RemDupsNoBuffer(ListNode head) {
		if (head == null) {
			System.out.println("List is empty:");
			return;
		}

		ListNode current = head;
		while (current != null) {
			ListNode runner = current;
			while (runner.next != null) {
				if (runner.next == current) {
					runner.next = runner.next.next;
					// System.out.println(runner.data);
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
		return;
	}

	private static class ListNode {
		private int data;
		private ListNode next;
		//private ListNode previous;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		//	this.previous = null;
		}
	}

	private static class LinkedList {
		ListNode head = null;
		ListNode tail = null;
		//int size = 0;

		public void addLast(int data) {
			//size++;
			if (head == null) {
				head = new ListNode(data);
				tail = head;
			} else {
				ListNode temp = new ListNode(data);
				//temp.previous = tail;
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

