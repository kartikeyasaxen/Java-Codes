import java.util.*;
public class stackusingarray{
    static class stack{
    int[] arr;
    int top;
    int size;

    stack(int length)
    {
        this.arr=new int[length];
        this.top= -1;
        this.size= length;
    }

    public void push(int ele) //insert
    {
        if(top!= size-1)
        {
            top++;
            arr[top]=ele;
        }
        else
        {
            throw new IllegalStateException("stack overflow: cant push ele because stack is full");
        }
    }

    int pop()  //delete
    {
        if(top== -1)
        {
            throw new IllegalStateException("stack underflow: cant push ele because stack is full");
        }
        else
        {
            int pop_ele =arr[top];
            top--;
            return pop_ele;
        }
    }

    int peek()
    {
        if(top== -1)
        {
            throw new IllegalStateException("empty");

        }
        else{
            return arr[top];
        }
    }

    public boolean isEmpty()
    {
        if(top== -1)
        return true;
        else
        return false;
    }}

    public static void main(String[] args)
    {
        Stack <Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.peek();
        System.out.println(st.peek());


    }

}