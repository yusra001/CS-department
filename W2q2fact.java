package week2;
import java.util.Scanner;

public class W2q2fact {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find its factorial");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1 ; i<=n;i++){
            fact = fact * i;
          System.out.println(fact);
        }
        System.out.print(fact);
    }
}
