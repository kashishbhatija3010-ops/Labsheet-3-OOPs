package labsheet3;
import java.util.Scanner;
class ArrayCopy {
    int[] arr = new int[5];
    int[] copy = new int[5];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
    }
    void copyArray() {
        for (int i = 0; i < arr.length; i++)
            copy[i] = arr[i];
    }
    void display() {
        System.out.println("Copied array:");
        for (int num : copy)
            System.out.print(num + " ");
    }
}
public class Q6 {
    public static void main(String[] args) {
        ArrayCopy obj = new ArrayCopy();
        obj.input();
        obj.copyArray();
        obj.display();
    }
}