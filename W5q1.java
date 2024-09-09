
import java.util.Scanner;
public class W5q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array 1");
        int a = sc.nextInt();
        System.out.println("enter the size of array 2 ");
        int b = sc.nextInt();
        int arr1[]=new int[a];
        int arr2[]=new int[b];
        System.out.println("enter the elements of array1");
        for(int i = 0 ;i <a;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the elements of array 2 ");

        for(int i = 0 ;i <b;i++){
            arr2[i]=sc.nextInt();
        }
        int c = a+b;
        int arr3[]=new int[c];
        for(int i = 0 ;i <a;i++){
            arr3[i]=arr1[i];
        }
        for(int i = 0 ;i <b;i++){
            arr3[a+i]=arr2[i];

        }
        for(int i = 0 ; i<c-1;i++){
            for(int j = 0 ; j<c-i-1;j++){
                if(arr3[j]>arr3[j+1]){
                    int temp = arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
                
            }

        }
        for(int i = 0 ; i < c;i++){
            System.out.println(arr3[i]+"  ");
        }







        
    
    
    }
}