package week1;
import java.util.Scanner;

public class W1q4cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values to perform calculation");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int mul = a*b;
        int substraction = a - b ;
        float div = a/b;
        System.out.println(" addition of " + a + " and " +b+ "is" +sum);
        System.out.println(" multiplication of " + a + "and" +b+ "is" +mul);
        System.out.println(" substraction of " + a + "and" +b+ "is" +substraction);
        System.out.println(" division of " + a + "and" +b+ "is" +div);      
    }
    
}
