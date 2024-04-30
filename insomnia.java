import java.util.*;
class insomnia
{
    public static void main(String[]args)
    {
        int k,l,m,n,d;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        l=sc.nextInt();
        m=sc.nextInt();
        n=sc.nextInt();
        d=sc.nextInt();
        int c=0;
        for(int i=1;i<=d;i++)
        {
            if(i%k==0||i%l==0||i%m==0||i%n==0)
            c=c+1;
            

        }
        System.out.println(c);


    }
}