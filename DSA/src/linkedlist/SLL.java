package linkedlist;

class node{
	int data;
	node next;
	
	node(int data){
		this.data=data;
		this.next=null;
	}
}

class linkedlist {
	node head;
	
	public void print() {
		node curr= head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public void add_last(int ele) {
		node temp=new node(ele);
		if(head==null) {
			head=temp;
		}
		else {
			node curr=head;
			while(curr.next != null) {
				curr= curr.next;
			}
			curr.next=temp;
		}
	}
	
	public void add_first(int ele) {
		node temp=new node(ele);
		if(head==null) {
			head=temp;
		}
		else {
			temp.next=head;
			head= temp;
			
		}
	}
	
	public void delete_last (){
		if(head==null) {
			System.out.println("ll already empty");
		}
		else if(head.next==null) {
			head=null;
			System.out.println("element deleted");
		}
		else {
			node curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
		}
	}
		
	
	public void delete_first() {
		if(head==null) {
			System.out.println("ll already empty");
		}
		else if(head.next==null) {
			head=null;
			System.out.println("element deleted");
		}
		else {
			head=head.next;
		}
	}
	
	public int size() {
		int count=0;
		node curr= head;
		while(curr!=null) {
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	public void add_index(int index,int ele) {
		if(index>size()|| index<0) {
			System.out.println("invalid index");
			return;
		}
		if(index==0) {
			add_first(ele);
		}
		else if(index==size()) {
			add_last(ele);
		}
		else {
			node curr=head;
			node temp=new node(ele);
			for(int i=0; i<index-1; i++) {
				curr=curr.next;
			}
			temp.next=curr.next;
			curr.next=temp;
		}
	}
	
	public void del_index(int index) {
		if(index<0 || index>size()-1) {
			System.out.println("invalid index");
			return;
		}
		if(index==0) {
			delete_first();
		}
		else if(index==size()-1) {
			delete_last();
		}
		else {
			node curr=head;
			for(int i=0; i<index-1; i++) {
				curr=curr.next;
			}
			curr.next=curr.next.next;
		}
	}
	
	public void get_first() {
		System.out.println(head.data); 
	}
	
	public void get_last() {
		node curr=head;
		for(int i=0; i<size()-1; i++) {
			curr=curr.next;
		}
		System.out.println(curr.data); 
	}
	
	public void get_index(int index) {
		if(index<0 || index>size()-1) {
			System.out.println("invalid index");
			return;
		}
		else if(index==0) {
			get_first();
		}
		else if(index==size()-1) {
			get_last();
		}
		else {
			node curr=head;
			for(int i=0; i<index; i++) {
				curr=curr.next;
			}
			System.out.println(curr.data); 

		}
	}
}

public class SLL {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		node n1=new node(10);
//		node n2=new node(20);
//		node n3=new node(30);
//		node n4=new node(40);
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		node head = n1;
//		print(head);
		
		linkedlist ll = new linkedlist();
		ll.add_last(10);
		ll.add_last(20);
		ll.add_last(30);
		ll.add_last(40);
		ll.add_first(50);
		ll.add_first(60);
		ll.add_first(70);
		ll.print();
		ll.del_index(7);
		ll.print(); 
		ll.get_first();
		ll.get_last();
		ll.get_index(5);
		
		
		//assignment- get first method, get last, get at index
		
		
	}

}
