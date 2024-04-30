import java.util.*;
public class doublylinkedlist{
    Node head;
  int size;

    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val)//constructor
        {
            this.val=val;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
            
        }
        public Node(int val, Node next, Node prev)
        {
            this.val=val;
            this.next= next;
            this.prev = prev;
        }
    }


    public void insertfirst(int val) //insertion
    {
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
        head.prev=node;
        }
        head= node;
    }


    public void insertlast(int val)//insertion at last
    {
       Node node=new Node(val);
       Node last=head;
       node.next=null;
        if(head==null)
        {
            node.prev=null;
            head=node;
            return;
        }
       while(last.next!=null)
       {
        last=last.next;
       }
        last.next=node;
        node.prev=last;
    }

        public void insert(int val,int index)  //insertion at any index
    {
        if(index==0)
        {
            insertfirst(val);
            return;
        }
        if(index==size)
        {
            insertlast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;

        }

        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }


    public void display(){ //display
        Node node= head;
        while(node!= null)
        {
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("end");
    }


        public void displayrev(){ //display in reverse
        Node node= head;
        Node last=null;
        while(node!= null)
        {
            last=node;
            node = node.next;
        }
        while(last!=null)
        {
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("end");
    }


    public static void main(String [] args)
    {
        doublylinkedlist list=new doublylinkedlist();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);
        list.display();
       list.insertlast(99);
               list.display();
               list.insert(100,2);
               list.display();

    }



}