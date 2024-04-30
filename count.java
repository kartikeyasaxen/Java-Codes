import java.util.*;
public class count
{
    public static void main(String[] args)
    {
     String s="how are you";
        int c=0,i;
        int l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            c++;
            else
            continue;
        }
        System.out.println(c);
    }
}