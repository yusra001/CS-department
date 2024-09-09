package week1;
import java.util.Scanner;
public class W1sum {
    public static void main(String[]args){ 

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a");
    int a = sc.nextInt();
    System.out.println("enter the value of b");
    int b = sc.nextInt();
    int sum =  a + b;
    System.out.println("sum of " + a + " and "  + b + " is " +sum);
}
}
