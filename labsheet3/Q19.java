package labsheet3;
class JaggedArray {
    int[][] arr = {
        {1, 2},
        {3, 4, 5},
        {6, 7, 8, 9}
    };
    void display() {
        System.out.println("Jagged array:");
        for (int[] row : arr) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
public class Q19 {
    public static void main(String[] args) {
        JaggedArray obj = new JaggedArray();
        obj.display();
    }
}
