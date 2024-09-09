package week4;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of an array");
        for(int i = 0 ; i < n;i++){
            arr[i]=sc.nextInt();

        }
        int largest = arr[0];
        for(int i = 1 ; i < n;i++){
            if(arr[i]>largest){
               largest=arr[i];
            }

        }
        System.out.println("largest among array is " +largest);
    }
}
