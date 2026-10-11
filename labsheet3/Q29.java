package labsheet3;
import java.util.Arrays;
import java.util.Scanner;
class JaggedRowSort {
    int[][] arr;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        if (n <= 0) {
            arr = new int[0][];
            return;
        }
        arr = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter size of row " + (i + 1) + ": ");
            int size = sc.nextInt();
            if (size < 0) {
                System.out.println("Invalid row size.");
                arr[i] = new int[0];
                continue;
            }
            arr[i] = new int[size];
            System.out.println("Enter row elements:");
            for (int j = 0; j < size; j++)
                arr[i][j] = sc.nextInt();
        }
    }
    void sortRows() {
        for (int[] row : arr)
            Arrays.sort(row);
    }
    void display() {
        System.out.println("Sorted jagged array:");
        for (int[] row : arr) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
public class Q29 {
    public static void main(String[] args) {
        JaggedRowSort obj = new JaggedRowSort();
        obj.input();
        obj.sortRows();
        obj.display();
    }
}
