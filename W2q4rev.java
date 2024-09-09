package week2;
import java.util.Scanner;

public class W2q4rev {
     public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number to be reversed");
    int n = sc.nextInt();
    int rev = 0;
    int orignal = n;
    while(n!=0){
        int rem = n%10;
        rev = rev*10+rem;
        n =  n/10;
    }
System.out.println(+rev);
if(orignal == rev){
    System.out.println("palindrome");
}
else{
    System.out.println("not palindrome");
}


    }
}
