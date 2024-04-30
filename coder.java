import java.util.*;
class coder
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int c1=0;
        char [][] arr=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int c=i+j;
                if(c%2==0){
                arr[i][j]='c';
                c1=c1+1;}
                else
                arr[i][j]='.';
            }

        } 
        System.out.println(c1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
System.out.print(arr[i][j]);
}
System.out.println();}}}