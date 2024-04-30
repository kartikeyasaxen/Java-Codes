import java.util.*;
class zeroandones
{
    public static void main(String []args)
    {
        int n,c1=0,c2=0,z=0;
        String s;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=sc.next();

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1'){
                c1=c1+1;
            }
            else
            c2=c2+1;

        }
        if(c1>c2)
        {
            z=c1-c2;
            System.out.println(z);
        }
        else if(c1==c2)
        {
            z=0;
            System.out.println(z);
        }
        else{
            z=c2-c1;
            System.out.println(z);
        }
    }}
