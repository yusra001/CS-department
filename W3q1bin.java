package week3;
import java.util.Scanner;

public class W3q1bin {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n = sc.nextInt();
        
        int decimal = 0;
        int base = 1;  
        while (n > 0) {
            int lastDigit = n % 10;  
            decimal += lastDigit * base;   
            base = base * 2; 
            n = n/ 10;  
        }
        System.out.println("Decimal equivalent is: " + decimal);
        
        
    }
}
