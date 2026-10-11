package labsheet3;
import java.util.Scanner;
class TriangularMatrix {
    int[][] matrix;
    int n;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square matrix size: ");
        n = sc.nextInt();
        if (n <= 0) {
            matrix = new int[0][0];
            return;
        }
        matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
    }
    void display() {
        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((i <= j ? matrix[i][j] : 0) + " ");
            System.out.println();
        }
        System.out.println("Lower triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((i >= j ? matrix[i][j] : 0) + " ");
            System.out.println();
        }
    }
}
public class Q26 {
    public static void main(String[] args) {
        TriangularMatrix obj = new TriangularMatrix();
        obj.input();
        if (obj.n > 0)
            obj.display();
        else
            System.out.println("Invalid matrix size.");
    }
}
