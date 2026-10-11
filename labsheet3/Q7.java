package labsheet3;
import java.util.Scanner;
class MatrixInput {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
public class Q7 {
    public static void main(String[] args) {
        MatrixInput obj = new MatrixInput();
        obj.input();
        obj.display();
    }
}