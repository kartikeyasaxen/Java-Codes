import java.util.*;
public class indexof
{
    public static void main(String[]args)
    {
        int n,t,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[];
        a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        t=sc.nextInt();
        for(int j=0;j<n;j++)
         if(a[j]==t)
         {
            System.out.println(j);
            c=1;  
         }
         if(c==0)
         {
            System.out.println("-1");
         }       
    }}