package labsheet3;
import java.util.Scanner;
class MatrixSum {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    int calculateSum() {
        int sum = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                sum += matrix[i][j];
        return sum;
    }
}
public class Q8 {
    public static void main(String[] args) {
        MatrixSum obj = new MatrixSum();
        obj.input();
        System.out.println("Sum = " + obj.calculateSum());
    }
}