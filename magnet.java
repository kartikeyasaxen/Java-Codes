import java.util.*;
public class magnet
{
    public static void main(String args[])
    {
        int l,c=1;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        int n[];
        n=new int[l];
        
        for(int i=0;i<l;i++)
        {
            n[i]=sc.nextInt();
        }
        int j;
        for(j=0;j<l-1;j++)
        {
            if(n[j]!=n[j+1]){
            c=c+1;}
        }
        System.out.println(c);        

        
    }
}