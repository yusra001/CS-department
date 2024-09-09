package week1;
import java.util.Scanner;

public class w1q2 {
     public static void main(String[]args){
    
        System.out.println("enter a number to check if a number is odd or even");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
