
public class LoopBeg {
	
	public static void main(String args[]){
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=second;
		System.out.println("It starts from: ");
		System.out.println(findBeg(head).data);

	}
	
	public static ListNode findBeg(ListNode head){
		ListNode slow=head;
		ListNode fast=head;
		
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				break;
			}
		}
		
		if(fast==null || fast.next==null){
			return null;
		}
		
		slow=head;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
		
		
		return fast;
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
	
	/*private static class LinkedList{
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
	}*/

}
