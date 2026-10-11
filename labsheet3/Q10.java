package labsheet3;
import java.util.Scanner;
class ColumnSum {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    void calculateColumnSum() {
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++)
                sum += matrix[i][j];
            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }
}
public class Q10 {
    public static void main(String[] args) {
        ColumnSum obj = new ColumnSum();
        obj.input();
        obj.calculateColumnSum();
    }
}
