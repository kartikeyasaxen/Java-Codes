import java.util.*;
public class circle
{
    public static void main(String args[])
    {
        int n,sum=0,asum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[];
        a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int s,t;
        s=sc.nextInt();
        t=sc.nextInt();
        int td=0;
        for(int i=0;i<n;i++)
        {
            td=td+a[i];
        }
        if(s<t){
        for(int i=s;i<t;i++)
        {
            sum=sum+a[i-1];
        }
          asum=td-sum;
        }
        else
        {
            for(int i=t;i<s;i++)
        {
            sum=sum+a[i-1];
        }
         asum=td-sum;
        }
        if(sum<asum)
        System.out.println(sum);
        else
        System.out.println(asum);
    }}

    