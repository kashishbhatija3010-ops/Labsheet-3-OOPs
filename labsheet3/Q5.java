package labsheet3;
import java.util.Scanner;
class EvenOddArray {
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
    void countEvenOdd() {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}
public class Q5 {
    public static void main(String[] args) {
        EvenOddArray obj = new EvenOddArray();
        obj.input();
        if (obj.arr.length > 0) {
            obj.countEvenOdd();
        }
    }
}