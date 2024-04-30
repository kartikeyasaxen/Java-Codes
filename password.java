import java.util.*;
class password
{
    public static void main(String[]args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int l=s.length();
        int u=0,l1=0,l2=0;
        while(l>=5)
        {
            for(int j=0;j<l;j++){
                if(Character.isUpperCase(s.charAt(j)))
                u=u+1;
                if(Character.isLowerCase(s.charAt(j)))
                l1=l+1;
                if(s.charAt(j)=='?'||s.charAt(j)=='.'||s.charAt(j)=='!'||s.charAt(j)==','||s.charAt(j)=='_')
                l2=l2+1;

            }
            }
            if(u>0&&l1>0||l2>0)
            System.out.println("Correct");
            else
            System.out.println("Too weak");
        }
    }
