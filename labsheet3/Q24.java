package labsheet3;
import java.util.Scanner;
class RemoveDuplicates {
    int[] arr;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }
    void removeDuplicates() {
        int[] result = new int[arr.length];
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate)
                result[size++] = arr[i];
        }
        System.out.println("Array without duplicates:");
        for (int i = 0; i < size; i++)
            System.out.print(result[i] + " ");
    }
}
public class Q24 {
    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        obj.input();
        obj.removeDuplicates();
    }
}
