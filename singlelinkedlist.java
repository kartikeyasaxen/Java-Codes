 import java.util.*;
 public class singlelinkedlist{
    private Node head;
    private Node tail;





    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;

        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
            
        }}

    public void display()//display
    {   Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        
        }   System.out.println("end");
        }


    public void insertfirst(int val)//insertion
    {
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null)
        {
            tail=head;
        }
        size=size+1;
    }


    public void insertlast(int val)//insertion at last
    {
        if(tail==null)
        {
            insertfirst(val);

        }
        else
        {
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }}


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


    public int deletefirst() //delete first element
    {
        int val=head.value;
        head = head.next;
        if(head == null)
        {
            tail=null;
        }
        size=size-1;
        return val;
    }


    public Node get(int index) //to get element at particular position to delete
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }


    public int deletelast() //delete last element
    {
        if(size<=1){
            return deletefirst();
        }
        
        Node secondlast= get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        return val;

    }    


    public int delete(int index)//delete at any index
    {
        if(index == 0)
        {
            return deletefirst();
        }
        if(index== size-1)
        {
            return deletelast();
        }

        Node prev = get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;

        return val;
    }


    public Node find(int value)//to find node of any value
    {
        Node node=head;
        while(node!=null)
        {
            if(node.value==value)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }

    
    

    public static void main(String []args)
    {
        singlelinkedlist list=new singlelinkedlist();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);

        list.insertlast(99);  //insertion at last
        list.display();

        list.insert(90,4); //insertion at any index
        list.display();

        list.deletelast();
        list.display();

        list.deletefirst();//delete first element
        list.display();

        list.delete(1);//delete at any index
        list.display();


    }
 }