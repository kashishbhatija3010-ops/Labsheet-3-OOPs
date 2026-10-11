package labsheet3;
import java.util.Scanner;
class MatrixAddition {
    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter second matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextInt();
    }
    void add() {
        System.out.println("Sum of matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }
}
public class Q12 {
    public static void main(String[] args) {
        MatrixAddition obj = new MatrixAddition();
        obj.input();
        obj.add();
    }
}