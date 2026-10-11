package labsheet3;
import java.util.Scanner;
class ThreeDArraySum {
    int[][][] arr = new int[2][2][2];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    arr[i][j][k] = sc.nextInt();
    }
    int calculateSum() {
        int sum = 0;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    sum += arr[i][j][k];
        return sum;
    }
}
public class Q15 {
    public static void main(String[] args) {
        ThreeDArraySum obj = new ThreeDArraySum();
        obj.input();
        System.out.println("Sum = " + obj.calculateSum());
    }
}
