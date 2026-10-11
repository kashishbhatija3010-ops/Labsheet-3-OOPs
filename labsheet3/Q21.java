package labsheet3;
import java.util.Scanner;
class ArrayRotation {
    int[] arr;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            arr = new int[0];
            return;
        }
        arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }
    void rotateLeft() {
        if (arr.length == 0) {
            System.out.println("Empty array.");
            return;
        }
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = first;
    }
    void display() {
        System.out.println("Array after left rotation:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
public class Q21 {
    public static void main(String[] args) {
        ArrayRotation obj = new ArrayRotation();
        obj.input();
        obj.rotateLeft();
        obj.display();
    }
}