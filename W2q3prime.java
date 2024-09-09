package week2;
import java.util.Scanner;

public class W2q3prime {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number to check if its prime or not");
    int n = sc.nextInt();
    int count = 0;
    for(int i = 1;i <=n;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("yes its a prime number");
    }
    else{
        System.out.println("its not  a prime number");
    }

}
}
