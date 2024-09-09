import java.util.Scanner;
public class Rev {
public static void main(String []args){

 Scanner sc = new Scanner(System.in);
 System.out.println("enter your string");
 String a = sc.nextLine();
 String orignal= 
 String rev = " ";
 for (int i = 0 ; i<a.length();i++) {
    char ch = a.charAt(i);
    rev= a.charAt(i)+rev;
     
 }
 System.out.println(rev);


}

}
