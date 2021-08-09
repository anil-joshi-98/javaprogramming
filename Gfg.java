import java.util.*;
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
		next=null;
	}
}
class Gfg{
	void display(Node head){
		Node d=head;
		while(d!=null){
			System.out.println(d.data);
			d=d.next;
		}
	}
	Node insert(int data){
		Node n=new Node(data);
		return n;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Gfg d=new Gfg();
		Node op=new Node(0);
		Node head=null;
		for(int i=0;i<3;i++)
		{
			head=d.insert(12);
			op.next=head;
		}
		d.display(head);
	}
}