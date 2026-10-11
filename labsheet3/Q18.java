package labsheet3;
import java.util.Scanner;
class Search3D {
    int[][][] arr = new int[2][2][2];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    arr[i][j][k] = sc.nextInt();
    }
    void search(int key) {
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (arr[i][j][k] == key) {
                        System.out.println("Found at position: [" + i + "][" + j + "][" + k + "]");
                        return;
                    }
        System.out.println("Element not found.");
    }
}
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Search3D obj = new Search3D();
        obj.input();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        obj.search(key);
    }
}
