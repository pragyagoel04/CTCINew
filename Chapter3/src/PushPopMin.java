import java.util.Arrays;

public class PushPopMin {
	public static void main(String args[]) {
		myStack mystack = new myStack();
		System.out.println("Pushed: "+ mystack.push(300));
		System.out.println("Pushed: "+ mystack.push(500));
		System.out.println("Pushed: "+ mystack.push(1));
		System.out.println("Pushed: "+ mystack.push(20));
		System.out.println("Pushed: "+ mystack.push(8));
		System.out.println("Pushed: "+ mystack.push(1000));


		System.out.println("Min: "+mystack.min());

		System.out.println("Popped: "+mystack.pop());
		System.out.println("Popped: "+mystack.pop());
		System.out.println("Popped: "+mystack.pop());
		System.out.println("Popped: "+mystack.pop());

		System.out.println("Min: "+mystack.min());

	}

	private static class myStack {
		int size = 10;
		int array[] = new int[size];
		//int data;
		int pointer = 0;

		public int push(int data) {
			if(pointer==size){
				return 404;
			}
			else{
			array[pointer] = data;
			//pointer++;
			return array[pointer++];
			}
		}

		public int pop() {
			pointer--;
			if (pointer == -1)
				return 404;
			else
				return array[pointer];
		}

		public int min() {
			int tempArray[] = Arrays.copyOfRange(array, 0, pointer);
			Arrays.sort(tempArray);
			return tempArray[0];
		}
	}
}
