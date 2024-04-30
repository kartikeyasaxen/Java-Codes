import java.util.*;
public class romalucky
{
    static int countl(int num)
        {
            int c=0;
            while(num>0){
            
            int l=num%10;
            if(l==4||l==7)
            c++;
            num=num/10;

        }
        return c;
        }
    public static void main(String args[])
    {
        int n,k,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int a[];
        a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int num:a)
        {
            if(countl(num)<=k)
            c++;
        }
        System.out.println(c);}
        
            

        }