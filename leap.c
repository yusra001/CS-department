package week1;
import java.util.Scanner;

public class W1q5leap {
    public static void main(String[] args) {
        System.out.println("enter a yeear to check if its a leap year or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%100==0){
            if(year%400==0){
            System.out.println("its a leap year");
        }
    else{
        System.out.println("it is not a leap year"); 
    }}
        else if(year%4==0){
        System.out.println("its a leap year");
    }
    else{
        System.out.println("it is not a leap year");
    }
}
}
