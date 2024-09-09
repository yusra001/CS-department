package week3;
import java.util.Scanner;

public class W3q4sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to add its digits");
        int n = sc.nextInt();
        int sum = 0;
        int rev = 0;
        while(n>0){
        int rem = n%10;
        sum = sum + rem;
        n = n/10;
            
        }
        System.out.println(sum);
}
