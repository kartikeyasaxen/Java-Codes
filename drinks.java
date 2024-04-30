import java.util.*;
public class drinks
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[];
        a=new int[n];
        float s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
                    }
                    float avg=s/n;
                    System.out.println(avg);
                   

    }
}