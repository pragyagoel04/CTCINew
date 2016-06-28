import java.util.ArrayList;

public class SetOfStacks {
	static ArrayList<MyStack> stackList = new ArrayList<MyStack>();
	static MyStack newStack = new MyStack();
	static int pointer = 0;
	static int count = newStack.size;

	public static void main(String args[]) {
		SetOfStacks.push(100);
		SetOfStacks.push(400);
		SetOfStacks.push(200);
		SetOfStacks.push(900);
		SetOfStacks.push(700);
		SetOfStacks.push(600);
		System.out.println("Popped: "+SetOfStacks.pop());
		System.out.println("Popped: "+SetOfStacks.pop());
		System.out.println("Popped: "+SetOfStacks.pop());
		System.out.println("Popped: "+SetOfStacks.popAt(4));

	}

	public static void push(int data) {
		if (newStack.push(data))
			return;
		else {
			stackList.add(newStack);
			pointer++;
			newStack= new MyStack();
			newStack.push(data);
		}
		return;
	}
	
	static int pop(){
		int return_value;
		if(stackList.isEmpty()){
			return_value=newStack.pop();
			return return_value;
		}
		else{
			return_value=newStack.pop();
			if(return_value==-1){
				return_value=stackList.get(pointer-1).pop();
				count--;
				if(count==0){
					pointer--;
					count=newStack.size;
				}
			}
		}
		return return_value;
	}
	
	static int popAt(int index) {
		int return_value = 0;
		if (index > stackList.size()) return 404;
		
		if (index == stackList.size()) {
			return_value = newStack.pop();
			return return_value;
		}
		
		if (index < stackList.size()) {
			return_value = stackList.get(index).pop();
		}
		return return_value;
	}

	private static class MyStack {
		public MyStack() {
			super();
		}
		
		int size = 3;
		int array[] = new int[size];
		int pointer = 0;
		public boolean push(int data) {
			if (pointer == size) {
				return false;
			} else {
				array[pointer] = data;
				pointer++;
			}
			return true;
		}

		int pop() {
			pointer--;
			if (pointer <= -1)
				return -1;
			else {
				return array[pointer];
			}
		}
	}
}
