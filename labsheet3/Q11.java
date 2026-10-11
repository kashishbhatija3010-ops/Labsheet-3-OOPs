package labsheet3;
import java.util.Scanner;
class MatrixTranspose {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    void transpose() {
        System.out.println("Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
    }
}
public class Q11 {
    public static void main(String[] args) {
        MatrixTranspose obj = new MatrixTranspose();
        obj.input();
        obj.transpose();
    }
}
