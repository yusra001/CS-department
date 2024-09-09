package week3;
import java.util.Scanner;

public class W3q2dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a decimal number:");
        int decimalNumber = sc.nextInt();
        
        String binaryString = "";
        
        if (decimalNumber == 0) {
            binaryString = "0";
        } else {
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binaryString = remainder + binaryString;
                decimalNumber = decimalNumber / 2;
            }
        }
        
        System.out.println("Binary equivalent is: " + binaryString);
    }
}
