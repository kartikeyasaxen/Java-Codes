import java.util.*;
class team
{
    public static void main(String [] args)
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int a[];
        a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]+k<=5)
            c=c+1;
        }
        int temp=c/3;
        System.out.println(temp);
    }
}