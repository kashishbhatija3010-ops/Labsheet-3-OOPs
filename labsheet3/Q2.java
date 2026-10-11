package labsheet3;
import java.util.Scanner;
class ReverseArray {
    int[] arr = new int[10];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void displayReverse() {
        System.out.println("Array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        obj.input();
        obj.displayReverse();
    }
}
