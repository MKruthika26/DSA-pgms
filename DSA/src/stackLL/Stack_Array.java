package stackLL;

public class Stack_Array {
	int [] arr;
	int top;
	int size;
	Stack_Array(int size){
		this.size=size;
		arr=new int[size];
		this.top= -1;
		
		}
	public void push(int ele) {
		if(top == size-1) {
			System.out.println("stack overflow");
			return;
		}
		arr[++top] = arr[top];
		System.out.println(ele+"  added");
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("stack underflow");
			return -1;
		}
		int last = arr[top];
		top--;
		return last;
	}
	
	public int peek() {
		if(top == -1) {
			System.out.println("stack underflow");
			return -1;
		}
		return arr[top];
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(top == size-1) {
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack_Array sa = new Stack_Array(5);
		sa.push(10);
		sa.push(20);
		sa.push(30);
		sa.push(40);
		sa.push(50);
		System.out.println(sa.pop());
		System.out.println(sa.peek());

	}

}
