package week2;
import java.util.Scanner;

public class W2q1fib {
    public static void main(String[] args) {
        System.out.println("fibonacci series");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;

        
        System.out.print("enter the number of terms in fibonacci series");
        int n = sc.nextInt();
        System.out.print(+a+ "  "  +  b + "  ");
        for(int  i = 3 ; i<=n;i++){
            int c = a + b;
            System.out.print(+c+" ");

            a=b;
            b=c;
        

        }
    }
}
