
public class AddLinedLists {
	public static void main(String args[]){
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		LinkedList l3=new LinkedList();

		
		l1.addLast(4);
		l1.addLast(2);
		l1.addLast(8);
		l1.print();
		
		l2.addLast(9);
		l2.addLast(7);
		l2.addLast(3);
		l2.print();
		
		//int carry=0;
		l3.head=addLists(l1.head,l2.head);
		l3.print();

	}
	
	 public static ListNode addLists(ListNode l1, ListNode l2) {
	       int carry =0;
	 
	        ListNode newHead = new ListNode(0);
	        ListNode p1 = l1, p2 = l2, p3=newHead;
	 
	        while(p1 != null || p2 != null){
	            if(p1 != null){
	                carry = carry+ p1.data;
	                p1 = p1.next;
	            }
	 
	            if(p2 != null){
	                carry = carry + p2.data;
	                p2 = p2.next;
	            }
	 
	            p3.next = new ListNode(carry%10);
	            p3 = p3.next;
	            carry /= 10;
	        }
	 
	        if(carry==1) 
	            p3.next=new ListNode(1);
	 
	        return newHead.next;
	    }
	
	private static class ListNode{
		private int data;
		private ListNode next;
		//private ListNode previous;
		
		public ListNode(int data){
			this.data=data;
			this.next=null;
			//this.previous=null;
		}
	}
	
	private static class LinkedList{
		ListNode head = null;
		ListNode tail = null;

		public void addLast(int data) {
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
