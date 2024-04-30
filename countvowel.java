import java.util.*;
public class countvowel
{
    public static void main(String[]args)
    {
        int c=0;
        char ch=' ';
        String s;
         Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
       
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
        
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                 c++;
            }}

        
        System.out.println(c);
    }
}