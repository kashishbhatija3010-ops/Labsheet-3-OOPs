package labsheet3;
import java.util.Scanner;
class ArrayInput {
    int[] arr = new int[5];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
class ArrayDisplay {
    void display(int[] arr) {
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        ArrayInput input = new ArrayInput();
        ArrayDisplay display = new ArrayDisplay();
        input.input();
        display.display(input.arr);
    }
}