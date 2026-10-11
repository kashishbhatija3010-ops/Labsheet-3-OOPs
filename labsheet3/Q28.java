package labsheet3;
import java.util.Scanner;
class MatrixSearch {
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
    void search(int key) {
        boolean found = false;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == key) {
                    System.out.println("Found at row " + (i + 1) + ", column " + (j + 1));
                    found = true;
                }
        if (!found)
            System.out.println("Element not found.");
    }
}
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixSearch obj = new MatrixSearch();
        obj.input();
        if (obj.rows <= 0 || obj.cols <= 0) {
            System.out.println("Invalid matrix dimensions.");
            return;
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        obj.search(key);
    }
}
