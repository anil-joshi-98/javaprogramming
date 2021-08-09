import java.util.Scanner;
class Node{
    Node next;
    int data;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
class Link{
    Node insert(int data,Node head){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            return head;
        }
        else{
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t=temp;
        return head;
        }
    }
    void display(Node head){
        if(head==null){
            System.out.println("empty linkedlist");
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
public class Circular{
    public static void main(String[] args){
        Link ob=new Link();
        Node head=null;
        head=ob.insert(13,head);
        ob.display(head);
    }
}