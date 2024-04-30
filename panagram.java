import java.util.*;
public class panagram

{
	public static void main(String[] args) {
	    String s;
	    int c=0,n;
	    Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
	    s=sc.next();
	    s=s.toLowerCase();
	    for(int i='a';i<='z';i++)
	    {
	        c=0;
	        for(int j=0;j<s.length();j++)
	        {
	            if(i==s.charAt(j))
	            {
	                c=1;
	                break;
	            }
	            
	        }
	        if(c==0){
	        System.out.println("NO");
	        break;
	        }
	    }
	    if(c>0)
	    System.out.println("YES");
	}
}