package doubly_LL;

class node {
	int data;
	node next;
	node prev;
	
	node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}

class DLL{
	node head;
	node tail;
	public void print() {
		node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public void print_last() {
		node curr=tail;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.prev;
		}
		System.out.println();
	}
	
	public void add_last(int ele) {
		node temp=new node(ele);
		if(tail==null) {
			head=temp;
			tail=temp;
		}
		else {
			temp.prev=tail;
			tail.next=temp;
			tail=temp;
		}
	}
	
	public void add_first(int ele) {
		node temp=new node(ele);
		if(head==null) {
			head=temp;
			tail=temp;
		}
		else {
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
	}
	
	public void add_at_index(int ind, int ele) {
		node temp=new node(ele);
		if(ind<0 || ind>size()) {
			System.out.println("invalid index");
			return;
		}
		else if(ind==0) {
			add_first(ele);
		}
		else if(ind==size()) {
			add_last(ele);
		}
		else {
			 node curr=head;
			 for(int i=0; i<ind-1; i++) {
				 curr=curr.next;
			 }
			 temp.next=curr.next;
			 temp.prev=curr;
			 curr.next.prev=temp;
			 curr.next=temp;
		}
	}
	
	public int size() {
		int count=0;
		node curr= head;
		while (curr!=null) {
			count++;
			curr=curr.next;
		}
		return count;
	}
		
	public void del_first() {
		if(head==null) {
			System.out.println("LL already empty");
			return;
		}
		else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("element deleted");
		}
		else {
			head=head.next;
			head.prev=null;
		}
	}
	
	public void del_last() {
		if(head==null) {
			System.out.println("LL already empty");
			return;
		}
		else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("element deleted");
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
	}
	
	public void del_at_index(int ind) {
		if(ind<0 || ind>size()-1) {
			System.out.println("invalid index");
			return;
		}
		else if(ind==0) {
			del_first();
		}
		else if(ind==size()-1) {
			del_last();
		}
		else {
			node curr=head;
			for(int i=0; i<ind-1; i++) {
				curr=curr.next;
			}
			curr.next=curr.next.next;
			curr.next.prev=curr;
		}
	}
	
	public void get_first() {
		System.out.println(head.data);
	}
	
	public void get_last() {
		System.out.println(tail.data);
	}
			
	public void get_at(int ind) {
		if(ind<0 || ind>size()-1) {
			System.out.println("invalid index");
			return;
		}
		else if(ind==0) {
			get_first();
		}
		else if(ind==size()-1) {
			get_last();
		}
		else {
			node curr=head;
			for(int i=0; i<ind; i++) {
				curr=curr.next;	
			}
			System.out.println(curr.data);
		}	
	}
}

public class DLL_first {
	
	public static void main(String[] args) {

		DLL dll=new DLL();
		dll.add_last(10);
		dll.add_last(20);
		dll.add_last(30);
		dll.add_last(40);
		dll.add_first(5);
		dll.add_first(2);
		dll.add_first(1);
		dll.print();
//		dll.print_last();
		dll.get_first();
		dll.get_last();
		dll.get_at(1);
		
		
//		dll.print();
//		dll.print_last();
//		dll.del_first();
//		dll.del_last();
//		dll.print();
//		dll.print_last();
//		dll.add_at_index(2, 90);
//		dll.print();
//		dll.del_at_index(4);
//		dll.print();
//		dll.print_last();
//		
	
	}
}



//f1.print(head);
//f1.print_last(tail);
//node n1= new node(10);
//node n2= new node(20);
//node n3= new node(30);
//node n4= new node(40);
//node n5= new node(50);
//n1.next=n2;
//n2.next=n3;
//n3.next=n4;
//n4.next=n5;
//n5.prev=n4;
//n4.prev=n3;
//n3.prev=n2;
//n2.prev=n1;
//
//node head=n1;
//node tail=n5;


//



