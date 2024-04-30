import java.util.*;
public class stack
{
    public static void main(String[]args)
    {
        Stack <Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.pop();

        System.out.println(st.peek());

        System.out.println(st.isEmpty());
        System.out.println(st);

        while(!st.empty())
        {
            System.out.println(st.peek());
            st.pop();
        }
        
    }}