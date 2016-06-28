import java.util.Scanner;

public class FindKthToLast {
	public static void main(String args[]) {

		LinkedList ll = new LinkedList();
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(4);
		ll.addLast(6);
		ll.addLast(8);
		ll.addLast(1);
		ll.addLast(9);

		System.out.println("Value of K");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		System.out.println(kthelement(ll, k).data);
		in.close();
	}

	public static ListNode kthelement(LinkedList dd, int k) {
		if (dd.head == null || k <= 0) {
			return null;
		}

		ListNode p1 = dd.head;
		ListNode p2 = dd.head;
		for (int i = 0; i < k - 1; i++) {
			if(p2==null)
				return null;
			p2=p2.next;
		}
		while(p2.next!=null){
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}

	private static class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}

	}

	private static class LinkedList {
		ListNode head = null;
		ListNode tail = null;
		int size = 0;

		public void addLast(int data) {
			size++;
			if (head == null) {
				head = new ListNode(data);
				tail = head;
			} else {
				ListNode temp = new ListNode(data);
				temp.previous = tail;
				tail.next = temp;
				tail = tail.next;
			}
		}

	}

}
