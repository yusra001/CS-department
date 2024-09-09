package week4;
import java.util.*;
public class W4q1arrr {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        System.out.println("enter the size of an array");
        int n = sc .nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of an array");
        for(int i = 0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ELEMENTS OF ARRAY ARE");
        for(int i = 0 ; i <n ;i++){
            System.out.println(arr[i]);
        }
        for(int i =0; i < n;i++ ){
             sum = sum + arr[i];
             
        }
        System.out.println("sum of elements of an array is " + sum);
        float average = (sum)/n;
        System.out.println("average of an elements of an array "+average);
        int max=arr[0];
        int min=arr[0];
        for(int i = 1 ;i <n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min) {
                    min=arr[i];
            }
           
        }
        System.out.println("maximum = " +max);
        System.out.println("minimum = " +min);
    }
}
