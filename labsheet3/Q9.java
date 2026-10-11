package labsheet3;
import java.util.Scanner;
class RowSum {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    void calculateRowSum() {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += matrix[i][j];
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }
}
public class Q9 {
    public static void main(String[] args) {
        RowSum obj = new RowSum();
        obj.input();
        obj.calculateRowSum();
    }
}
