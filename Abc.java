import java.util.*;


class Linkedlist{
	static class Node{
		int data;
		Node next;
		}
		static Node top=null;
	static void insert(int data){
		Node temp=new Node();
		temp.data=data;
		temp.next=top;
		top=temp;
	}
	static void delete(){
		if(top==null)
		System.out.println("stack is empty");
		else
		top=top.next;
	}
	static void display(){
		if(top==null)
		System.out.println("stack is empty");
		else 
		{
			Node temp=top;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
}

class Abc{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int ch=0;
		while(ch!=4){
			System.out.printf("1.insert\n2.delete\n3.display\n4.quit");
			ch=in.nextInt();
			if(ch==1){
			System.out.println("enter data");
			int data=in.nextInt();
			Linkedlist.insert(data);
			}
			else if(ch==2)
			Linkedlist.delete();
			else if(ch==3)
			Linkedlist.display();
		}
	}
}