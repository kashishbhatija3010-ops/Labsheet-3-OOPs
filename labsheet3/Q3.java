package labsheet3;
import java.util.Scanner;
class ArraySum {
    int[] arr;
    int n;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        if (n <= 0) {            System.out.println("Invalid array size.");
            arr = new int[0];
            return;
        }
        arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    int calculateSum() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
public class Q3 {
    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        obj.input();
        if (obj.arr.length > 0) {
            System.out.println("Sum = " + obj.calculateSum());
        }
    }
}