import java.util.*;
public class queue
{
    int arr[];
    int f,r,size;
    public queue(int length)
    {
        arr=new int[length];
        f = -1;
        r = -1;
        size=length;
    }

    void push(int v)
    {
        if(r==size-1)
        {
            System.out.println("overflow");
        }
        else if(f==-1 && r==-1)
        {
            f=0;
            r=0;
            arr[r]=v;
        }
        else
        arr[++r]=v;
        System.out.println("item added="+v);
    }

    int pop()
    {
        if(r==-1 && f==-1)
        {
            System.out.println("underflow");
        }
            f++;
            size--;
            int t=arr[f];
            return t;     

    }

        int peek()
    {
        if(f==-1&&r==-1)
        {
            throw new IllegalStateException("empty");

        }
        else{
            return arr[f];
        }
    }

        public boolean isEmpty()
    {
        if(f==-1 && r==-1)
        return true;
        else
        return false;
    }

    void display()
    {
        if(r==-1&&f==-1)
        System.out.println("empty");
        else{
            for(int i=0;i<=r;i++)
            System.out.println(arr[i]+" ");
        }
    }
    
     public static void main(String[] args)
    {
        queue st= new queue(5);

        st.push(4);
        st.push(2);
        st.push(3);
        st.display();
        System.out.println("deleted item "+st.pop());
        st.display();
        System.out.println("deleted item "+st.pop());
        System.out.println("peek "+st.peek());
        System.out.println("is empty ="+st.isEmpty());
        st.display();
        }
        }