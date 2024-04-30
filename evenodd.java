import java.util.*;
public class evenodd {
    public static void main(String []args) {
        long n ;
        long k ;
        Scanner sc=new Scanner(System.in);
          n=sc.nextLong();
           k=sc.nextLong();
        long test = n % 2 != 0 ? (n / 2) + 1 : (n / 2);
        if (k <= test) {
            System.out.println((2 * k) - 1);
        } else {
            System.out.println(2 * (k - test));
        }
    }
}
