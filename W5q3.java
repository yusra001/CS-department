import java.util.Scanner;

public class W5q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between the range ");

        for (int num = start; num <= end; num++) {
            if (num <= 1) {
                continue; 
            }
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
