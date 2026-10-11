package labsheet3;
import java.util.Scanner;
class BoundaryMatrix {
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
    void displayBoundary() {
        System.out.println("Boundary elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
public class Q27 {
    public static void main(String[] args) {
        BoundaryMatrix obj = new BoundaryMatrix();
        obj.input();
        if (obj.rows > 0 && obj.cols > 0)
            obj.displayBoundary();
        else
            System.out.println("Invalid matrix dimensions.");
    }
}
