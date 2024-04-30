//codeforces 1a
import java.util.*;
public class theatre
{
	public static void main(String[] args)
	{
	int n,m,a;
	Scanner sc =new Scanner(System.in);
    
    n=sc.nextInt();
    m=sc.nextInt();
	a=sc.nextInt();
	int side1=(n+a-1)/a;
    int side2=(m+a-1)/a;
	System.out.println(side1*side2);
}
}