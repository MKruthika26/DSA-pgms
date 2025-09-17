package linkedlist;

class node1 {
	node1 next;
	int data;
	
	node1(int data){
		this.data=data;
		this.next=null;
	}
}
class linkedlist1{
	node1 head;
	
	public void print1() {
		node1 curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	
	public void add_last(int ele) {
		node1 temp=new node1(ele);
		if(head==null) {
			head=temp;
		}
		else {
			node1 curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=temp;
		}
	}
	
	public void add_first(int ele) {
		node1 temp=new node1(ele);
		if(head==null) {
			head=temp;
		}
		else {
			temp.next=head;
			head=temp;
		}
	}
	
		public int size() {
		int count=0;
		node1 curr=head;
		while(curr != null) {
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	public void add_at_index(int index, int ele) {
		if(index<0 || index>size()) {
			System.out.println("invalid index");
			return;
		}
		else if(index==0) {
			add_first(ele);
		}
		else if(index==size()) {
			add_last(ele);
		}
		else {
			node1 curr= head;
			node1 temp=new node1(ele);
			for(int i=0; i<index-1; i++) {
				curr=curr.next;
			}
			temp.next=curr.next;
			curr.next=temp;
		}
	}
	
	public void delete_first() {
		if(head==null) {
			System.out.println("list already empty");
		}
		else if(head.next==null) {
			head=null;
			System.out.println("element deleted");
		}
		else {
			head=head.next;
		}
	}
	
	public void delete_last() {
		if(head==null) {
			System.out.println("list already empty");
		}
		else if(head.next==null) {
			head=null;
			System.out.println("element deleted");
		}
		else {
			node1 curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
		}	
	}
	
	public void delete_at_index(int ind) {
		if(ind<0 || ind>size()) {
			System.out.println("invalid index");
			return;
		}
		else if(ind==0) {
			delete_first();
		}
		else if(ind==size()) {
			delete_last();
		}
		else {
			node1 curr=head;
			for(int i=0; i<ind-1; i++) {
				curr=curr.next;
			}
			curr.next=curr.next.next;
		}
	}
	
	public void get_first() {
		System.out.println(head.data);
	}
	
	public void get_last() {
		node1 curr=head;
		for(int i=0; i<size()-1; i++) {
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
	
	public void get_at_ind(int ind) {
		if(ind<0 || ind>size()) {
			System.out.println("invalid index");
		}
		else if(ind==0) {
			get_first();
		}
		else if(ind==size()) {
			get_last();
		}
		else {
			node1 curr=head;
			for(int i=0; i<ind; i++) {
				curr=curr.next;
			}
			System.out.println(curr.data);
		}
	}
}
public class Sll_practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist1 ll1= new linkedlist1();
		ll1.add_last(10);
		ll1.add_last(20);
		ll1.add_last(30);
		ll1.add_first(5);
		ll1.add_first(1);
		ll1.print1();
		ll1.get_first();
		ll1.get_last();
		ll1.get_at_ind(2);
		
	}
}

//
//
//
//
//
