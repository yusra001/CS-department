package week1;
import java.util.Scanner;

public class w1q3great {
    public static void main(String[] args) {
        System.out.println("printing greatest of three numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
        int c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println("a is the greatest");
        }
        else if(b>a&&b>c){
            System.out.println("b is the greatest");
        }
        else{
            System.out.println("c is the greatest");
        }
    }
}
