import java.util.*;
class blackjack
{
    public static void main(String []args)
    {
        int n,n1,c=0;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n1=n-10;
        if(n==0||n==10){
        c=0;
        System.out.println(c);
        }
        else if(n1==2||n1==3||n1==4||n1==5||n1==6||n1==7||n1==8||n1==9){
        c=4;
        System.out.println(c);}
        else if(n1==10){
        c=15;
        System.out.println(c);}
        else
        System.out.println(c);

    }
}