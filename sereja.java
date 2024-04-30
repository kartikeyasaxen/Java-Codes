import java.util.*;
public class sereja
{
    public static void main(String [] args)
    {
        int n,s,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=sc.nextInt();
        int a[];
        a=new int[n];
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        sum=sum+a[i];
        }
        Arrays.sort(a);
        int sum1=sum-a[a.length-1];
        if(sum1<=s)
        System.out.println("YES");
        else 
        System.out.println("NO");
     
        
    }}
