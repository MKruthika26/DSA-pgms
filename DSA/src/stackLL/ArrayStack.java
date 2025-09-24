package stackLL;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class Linked{
	Node head;
	
	public void push(int ele) {
		Node temp=new Node(ele);
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
			System.out.println("LL is already empty");
			return -1;
		}
		else {
			int top=head.data;
			head=head.next;
			return top;
			
		}
	}
	
	
	public int peek() {
		if(head==null) {
			System.out.println("List is Empty");
			return -1;
		}
		else {
			return head.data;
		}
	}
	
	
	public boolean isEmpty() {
		if(head== null) {
			return true;
		}
		else {
			return false;
		}
	}

}

public class ArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked ll=new Linked();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		System.out.println(ll.pop());
		System.out.println(ll.peek());
		System.out.println(ll.pop());
		System.out.println(ll.peek());
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll.peek());
		System.out.println(ll.isEmpty());


	}

}
