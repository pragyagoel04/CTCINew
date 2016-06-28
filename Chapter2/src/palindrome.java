
import java.util.Stack;

public class palindrome {
	
	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(3);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(3);
		ll.addLast(3);
		ll.addLast(1);
		ll.print();
		
		System.out.println(checkPalindrome(ll.head));
	}
	
	public static boolean checkPalindrome(ListNode head){
		
		ListNode fast=head;
		ListNode slow=head;
		
		Stack<Integer> stack= new Stack<Integer>();
		while(fast!=null && fast.next!=null){
			stack.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		
		if(fast!=null){
			slow=slow.next;
		}
		
		while(slow!=null){
			int top=stack.pop().intValue();
			if(top!=slow.data){
				return false;
			}
			
			slow=slow.next;
		}
		return true;
	}
	private static class ListNode {
		private int data;
		private ListNode next;
		// private ListNode previous;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
			// this.previous=null;
		}
	}

	private static class LinkedList {
		ListNode head = null;
		ListNode tail = null;

		public void addLast(int data) {
			if (head == null) {
				head = new ListNode(data);
				tail = head;
			} else {
				ListNode temp = new ListNode(data);
				// temp.previous = tail;
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
