package sCL;

class node{
	int data; 
	node next;
	
	node(int data){
		this.data=data;
		this.next=null;
	}
}

class Csll{
	node head;
	
	public void add_last(int ele) {
		node temp= new node(ele);
		if(head==null) {
			head=temp;
			temp.next=head;
		}
		else {
			node curr=head;
			while(curr.next != head) {
				curr=curr.next;
			}
			curr.next=temp;
			temp.next=head;
		}
	}
	
	public void print() {
		if(head==null) {
			System.out.println("ll is empty");
		}
		else {
			node curr=head;
			do {
				System.out.print(curr.data+" ");
				curr=curr.next;
			}while(curr!=head);
			System.out.println();
		}
	}
	
	public void add_first(int ele) {
		node temp=new node(ele);
		if(head==null) {
			head=temp;
		}
		else {
			node curr=head;
			while(curr.next != head) {
				curr=curr.next;
			}
			curr.next=temp;
			temp.next=head;
			head=temp;
		}
	}
	
	public void del_last() {
		if(head==null) {
			System.out.println("ll already empty");
			return;
		}
		else if(head.next==head){
			head=null;
			System.out.println("element deleted");
		}
		else {
			node curr=head;
			do {
				System.out.print(curr.data+" ");
				curr=curr.next;
			}while(curr.next!=head);
			curr.next=head;
			System.out.println();
		}
	}
	
	public void del_first() {
		if(head==null) {
			System.out.println("ll already empty");
			return;
		}
		else if(head.next==head){
			head=null;
			System.out.println("element deleted");
		}
		else {
			head=head.next;
			node curr=head;
			while(curr.next!=head) {
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
			curr.next=head;
			System.out.println();
		}
	}
}

public class CircularLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Csll cll=new Csll();
		cll.add_last(10);
		cll.add_last(20);
		cll.add_last(30);
		cll.add_first(5);
		cll.add_first(2);
		cll.add_first(1);
		cll.print();
		cll.del_last();
//		cll.print();
		cll.del_first();
//		cll.print();
		
	}

}
