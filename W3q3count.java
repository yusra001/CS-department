package week3;
import java.util.Scanner;

public class W3q3count {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to count its consonants and vowels");
        String a = sc.nextLine().toLowerCase();
        int count = 0;
        int conscount = 0;
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            else if((ch>='a'&&ch<='z')){
                conscount++;
            }
        }
        System.out.println(count);
        System.out.println(conscount);
    }
}
