import java.util.*;

public class SortStack {
	public static void main(String args[]) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(9);
		stack.push(6);
		stack.push(2);

		System.out.println("Stack before sorting:");
		System.out.println(stack);
		
		sort(stack);
		
		System.out.println("Stack after sorting:");
		System.out.println(stack);
	}
	
	public static void sort(Stack<Integer> stack){
		Stack<Integer> temp= new Stack<Integer>();
		
		while(!stack.isEmpty()){
			int x=stack.pop();
			
			while(!temp.isEmpty() && x>temp.peek())
				stack.push(temp.pop());
			
			temp.push(x);
		}
		
		while(!temp.isEmpty())
			stack.push(temp.pop());
	}
}
