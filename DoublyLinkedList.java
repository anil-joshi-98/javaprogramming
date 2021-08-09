class DoublyLinkedList{
    public static void main(String[] args){
        List ob=new List();
        ob.insert(12);
        ob.insert(13);
        ob.insert(14);
        ob.insert(15);
        ob.display();
    }
}
class List{
    Node head=null;
    class Node{
        Node previous;
        Node next;
        int data;
        Node(int data) {
            this.data=data;
        }
    }
    void insert(int data){
        Node n=new Node(data);
        n.next=null;
        n.previous=null;
        if(head==null){
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            n.previous=temp;
            temp.next=n;
        }
    }
    void display(){
        if(head==null){
            System.out.println("empty linkedlist");
        }
        else{
            Node n=head;
            while(n!=null){
                System.out.println(n.data);
                n=n.next;
            }
        }
    }
}