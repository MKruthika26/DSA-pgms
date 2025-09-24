package queueArray;

public class ArayQueue {

	int front;
	int rear;
	int cap;
	int size;
	int [] arr;
	
	ArayQueue(int cap){
		front=rear=-1;
		this.cap=cap;
		size=0;
		arr=new int [cap];
	}
	
	public boolean isFull() {
		if(size==cap) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	
	public void enque(int ele) {
		if(isFull()) {
			System.out.println("queue already full");
			return;
		}
		if(front==-1) {
			front=0;
		}
		arr[++rear]=ele;
		size++;
		System.out.println(ele+" added to queue");
	}
	
	public int deque() {
		if(isEmpty()) {
			System.out.println("ntg to return");
			return -1;
		}
		int data=arr[front];
		front++;
		size--;
		if(size==0) {
			front=rear=-1;
		}
		return data;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("ntg to return");
			return -1;
		}
		int data=arr[front];
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArayQueue q=new ArayQueue(3);
		q.enque(10);
		q.enque(20);
		q.enque(30);
//		q.enque(40);
		System.out.println(q.peek());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		
	}

}
