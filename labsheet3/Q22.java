package labsheet3;
import java.util.Scanner;
class ElementFrequency {
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
    void countFrequency() {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}
public class Q22 {
    public static void main(String[] args) {
        ElementFrequency obj = new ElementFrequency();
        obj.input();
        obj.countFrequency();
    }
}
