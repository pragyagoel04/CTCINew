
public class ThreeStackArray {
	
	public static int stacksize = 5;
	public static int stack[] = new int[stacksize * 3];
	static int position;
	static int stackpointer[]={0,0,0};
	
	public static void main(String args[]) {
		
		push(0,100);
		push(1,100);
		push(2,100);
		push(0,300);
		push(1,400);
		push(2,500);
		System.out.println(pop(0));
		System.out.println(pop(1));
		System.out.println(pop(2));

	}
	
	private static void push(int stackNumber, int value){
		position=stackNumber*stacksize+stackpointer[stackNumber];
		stackpointer[stackNumber]++;
		stack[position]=value;
		
	}
	private static int pop(int stackNumber){
		position=stackNumber*stacksize+stackpointer[stackNumber]-1;
		if(stackpointer[stackNumber]==-1){
			System.out.println("Empty stack");
			return 0;
		}
		else{
			return stack[position];
		}
	}

}
