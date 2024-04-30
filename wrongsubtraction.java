//codeforces contest a
import java.util.*;
public class wrongsubtraction
{
    public static void main(String[]args)
{
    int i,k,n;
    Scanner sc =new Scanner(System.in);
    
    n=sc.nextInt();
    k=sc.nextInt();
    for(i=0;i<k;i++)
        if(n % 10 != 0)
            n=n-1;
        else
        n=n/10;      
 int result=n;
System.out.println(result); 
}}