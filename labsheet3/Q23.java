package labsheet3;
import java.util.Scanner;
class SecondLargest {
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
    void findSecondLargest() {
        if (arr.length < 2) {
            System.out.println("Second largest element does not exist.");
            return;
        }
        int largest = arr[0];
        int second = 0;
        boolean found = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
                found = true;
            } else if (arr[i] < largest && (!found || arr[i] > second)) {
                second = arr[i];
                found = true;
            }
        }
        if (found)
            System.out.println("Second largest = " + second);
        else
            System.out.println("Second largest distinct element does not exist.");
    }
}
public class Q23 {
    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        obj.input();
        obj.findSecondLargest();
    }
}