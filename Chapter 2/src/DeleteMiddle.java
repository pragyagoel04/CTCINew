
public class DeleteMiddle {
	public static void main(String args[]) {
		LinkedList ll=new LinkedList();
		ll.addLast(4);
		ll.addLast(1);
		ll.addLast(7);
		ll.addLast(3);
		ll.addLast(8);
		ll.addLast(0);
		ll.addLast(3);
		ll.addLast(6);
		ll.addLast(8);
		
		ll.print();
		DelMid(ll);
		ll.print();

	}
	
	public static void DelMid(LinkedList ll){
		int mid=ll.size/2;
		ListNode temp=ll.head;
		
		for(int i=0;i<mid;i++){
			temp=temp.next;
		}
		temp.previous.next=temp.next;
		return;
		
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
		int size = 0;
		ListNode head = null;
		ListNode tail = null;

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
