package stackLL;

class node{
	int data;
	node next;
	
	node(int data){
		this.data=data;
		this.next=null;
	}
}

class Stk{
	node head;
	
	public void push(int ele) {
		node temp=new node(ele);
		if(head==null) {
			head=temp;
		}
		else {
			temp.next=head;
			head=temp;
		}
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("stack underflow expt");
			return -1;
		}
		int top=head.data;
		head=head.next;
		return top;
		
	}
	
	public int peek() {
		if(head==null) {
			System.out.println("stack underflow expt");
			return -1;
		}
		return head.data ;
	}
	
	public boolean isEmpty() {
		if(head==null) {
			System.out.println("stack empty");
			return true;
		}
		return false;
	}
}

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stk st=new Stk();
		st.push(10);
		st.push(20);
		st.peek();
		st.peek();
	}

}
