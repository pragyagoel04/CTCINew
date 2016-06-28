import java.util.Stack;

public class MyQueue {
	Stack<Integer> in= new Stack<Integer>();
	Stack<Integer> out= new Stack<Integer>();
	
	public void enqueue(int n){
		in.push(n);
	}
	
	public int dequeue(){
		while(!in.empty())
			out.push(in.pop());
		return out.pop();
	}
	
	public static void main(String args[]){
		MyQueue que=new MyQueue();
		que.enqueue(30);
		que.enqueue(40);
		que.enqueue(50);
		que.enqueue(60);
		que.enqueue(70);
		System.out.println(que.dequeue());
				
	}
	
	
}
