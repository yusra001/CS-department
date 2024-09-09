import java.util.Scanner;
public class W5q4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 100;
        int stack[] = new int[SIZE];
        int top = -1; // Stack is empty initially
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: 
                    if (top == SIZE - 1) {
                        System.out.println("Stack Overflow");
                    } else {
                        System.out.print("Enter value to push: ");
                        int value = scanner.nextInt();
                        stack[++top] = value;
                        System.out.println("Pushed " + value);
                    }
                    break;
                case 2: // Pop
                    if (top == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println("Popped " + stack[top--]);
                    }
                    break;
                case 3: // Display
                    if (top == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack contents:");
                        for (int i = 0; i <= top; i++) {
                            System.out.print(stack[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
