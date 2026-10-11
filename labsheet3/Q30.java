package labsheet3;
import java.util.Scanner;
class SparseMatrix {
    int[][] matrix;
    int rows, cols;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        rows = sc.nextInt();
        cols = sc.nextInt();
        if (rows <= 0 || cols <= 0) {
            matrix = new int[0][0];
            return;
        }
        matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
    }
    void checkSparse() {
        int zeros = 0;
        int total = rows * cols;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == 0)
                    zeros++;
        if (zeros > total - zeros)
            System.out.println("The matrix is a sparse matrix.");
        else
            System.out.println("The matrix is not a sparse matrix.");
    }
}
public class Q30 {
    public static void main(String[] args) {
        SparseMatrix obj = new SparseMatrix();
        obj.input();
        if (obj.rows > 0 && obj.cols > 0)
            obj.checkSparse();
        else
            System.out.println("Invalid matrix dimensions.");
    }
}
