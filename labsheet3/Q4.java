package labsheet3;
import java.util.Scanner;
class MaximumArray {
    int[] arr;
    int n;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        if (n <= 0) {
            arr = new int[0];
          System.out.println("Invalid array size.");
            return;
        }
        arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    int findMaximum() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
public class Q4 {
    public static void main(String[] args) {
        MaximumArray obj = new MaximumArray();
        obj.input();
        if (obj.arr.length > 0) {
           System.out.println("Maximum element = " + obj.findMaximum());
        }
    }
}