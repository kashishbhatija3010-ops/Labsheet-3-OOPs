package labsheet3;
import java.util.Scanner;
class ThreeDArray {
    int[][][] arr = new int[2][2][2];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    arr[i][j][k] = sc.nextInt();
    }
    void display() {
        System.out.println("3-D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(arr[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
public class Q14 {
    public static void main(String[] args) {
        ThreeDArray obj = new ThreeDArray();
        obj.input();
        obj.display();
    }
}
