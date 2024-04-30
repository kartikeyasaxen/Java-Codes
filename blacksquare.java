import java.util.*;
class blacksquare
{
    public static void main(String [] args)
    {
        int a[];
        a=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<5;i++){
        a[i]=sc.nextInt();
    }
    String s;
    s=sc.next();
    int sum=0;

    for(int i=0;i<s.length();i++)
    {
        int temp=Integer.parseInt(s.valueOf(s.charAt(i)));
        sum=sum+a[temp];


    }
     System.out.println(sum);
}}