package week4;
import java.util.Scanner;

public class MATRIX_MULTIPLICATIPON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and coloumn for matrix 1 : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("enter number of rows and coloumn for matrix 2 : ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println("enter elemenst for matrix one : ");

        int[][] a1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter element for matrix 2 : ");
        int[][] b1 = new int[p][q];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b1[i][j] = sc.nextInt();
            }

        }
        int[][] c = new int[m][q];
        if (n != p) {
            System.out.println("multiplication for this type of matrix cant be done. ");

        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        c[i][j] = c[i][j] + a1[i][k] * b1[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
