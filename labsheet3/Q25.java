package labsheet3;
import java.util.Scanner;
class DiagonalSum {
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
    void calculateSum() {
        int main = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            main += matrix[i][i];
            secondary += matrix[i][n - 1 - i];
        }
        System.out.println("Main diagonal sum = " + main);
        System.out.println("Secondary diagonal sum = " + secondary);
    }
}
public class Q25 {
    public static void main(String[] args) {
        DiagonalSum obj = new DiagonalSum();
        obj.input();
        if (obj.n > 0)
            obj.calculateSum();
        else
            System.out.println("Invalid matrix size.");
    }
}