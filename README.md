# Labsheet-3-OOPs
Labsheet 3 java OOPs
# 1
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

# 2
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

# 3
package labsheet3;
import java.util.Scanner;
class ArraySum {
    int[] arr;
    int n;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        if (n <= 0) {            System.out.println("Invalid array size.");
            arr = new int[0];
            return;
        }
        arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    int calculateSum() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
public class Q3 {
    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        obj.input();
        if (obj.arr.length > 0) {
            System.out.println("Sum = " + obj.calculateSum());
        }
    }
}
# 4

package labsheet3;
import java.util.Scanner;
class MaximumArray {
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
    int findMaximum() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
public class Q4 {
    public static void main(String[] args) {
        MaximumArray obj = new MaximumArray();
        obj.input();
        if (obj.arr.length > 0) {
           System.out.println("Maximum element = " + obj.findMaximum());
        }
    }
}
# 5
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
# 6
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
# 7
package labsheet3;
import java.util.Scanner;
class MatrixInput {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
public class Q7 {
    public static void main(String[] args) {
        MatrixInput obj = new MatrixInput();
        obj.input();
        obj.display();
    }
}
# 8
package labsheet3;
import java.util.Scanner;
class MatrixSum {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    int calculateSum() {
        int sum = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                sum += matrix[i][j];
        return sum;
    }
}
public class Q8 {
    public static void main(String[] args) {
        MatrixSum obj = new MatrixSum();
        obj.input();
        System.out.println("Sum = " + obj.calculateSum());
    }
}
# 9
package labsheet3;
import java.util.Scanner;
class RowSum {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    void calculateRowSum() {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += matrix[i][j];
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }
}
public class Q9 {
    public static void main(String[] args) {
        RowSum obj = new RowSum();
        obj.input();
        obj.calculateRowSum();
    }
}
# 10
package labsheet3;
import java.util.Scanner;
class ColumnSum {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    void calculateColumnSum() {
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++)
                sum += matrix[i][j];
            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }
}
public class Q10 {
    public static void main(String[] args) {
        ColumnSum obj = new ColumnSum();
        obj.input();
        obj.calculateColumnSum();
    }
}
# 11
package labsheet3;
import java.util.Scanner;
class MatrixTranspose {
    int[][] matrix = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();
    }
    void transpose() {
        System.out.println("Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
    }
}
public class Q11 {
    public static void main(String[] args) {
        MatrixTranspose obj = new MatrixTranspose();
        obj.input();
        obj.transpose();
    }
}
# 12
package labsheet3;
import java.util.Scanner;
class MatrixAddition {
    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter second matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextInt();
    }
    void add() {
        System.out.println("Sum of matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }
}
public class Q12 {
    public static void main(String[] args) {
        MatrixAddition obj = new MatrixAddition();
        obj.input();
        obj.add();
    }
}
# 13
package labsheet3;
import java.util.Scanner;
class MatrixMultiplication {
    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    int[][] c = new int[3][3];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter second matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextInt();
    }
    void multiply() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    c[i][j] += a[i][k] * b[k][j];
    }
    void display() {
        System.out.println("Product of matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
public class Q13 {
    public static void main(String[] args) {
        MatrixMultiplication obj = new MatrixMultiplication();
        obj.input();
        obj.multiply();
        obj.display();
    }
}
# 14
package labsheet3;
import java.util.Scanner;
class ThreeDArray {
    int[][][] arr = new int[2][2][2];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    arr[i][j][k] = sc.nextInt();
    }
    void display() {
        System.out.println("3-D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(arr[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
public class Q14 {
    public static void main(String[] args) {
        ThreeDArray obj = new ThreeDArray();
        obj.input();
        obj.display();
    }
}
# 15
package labsheet3;
import java.util.Scanner;
class ThreeDArraySum {
    int[][][] arr = new int[2][2][2];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    arr[i][j][k] = sc.nextInt();
    }
    int calculateSum() {
        int sum = 0;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    sum += arr[i][j][k];
        return sum;
    }
}
public class Q15 {
    public static void main(String[] args) {
        ThreeDArraySum obj = new ThreeDArraySum();
        obj.input();
        System.out.println("Sum = " + obj.calculateSum());
    }
}
# 16
package labsheet3;
import java.util.Scanner;
class PositiveNegative {
    int[][][] arr = new int[2][2][2];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    arr[i][j][k] = sc.nextInt();
    }
    void count() {
        int positive = 0, negative = 0;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] > 0)
                        positive++;
                    else if (arr[i][j][k] < 0)
                        negative++;
                }
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
    }
}
public class Q16 {
    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative();
        obj.input();
        obj.count();
    }
}
# 17
package labsheet3;
import java.util.Scanner;
class Maximum3D {
    int[][][] arr = new int[2][2][2];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    arr[i][j][k] = sc.nextInt();
    }
    int findMaximum() {
        int max = arr[0][0][0];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (arr[i][j][k] > max)
                        max = arr[i][j][k];
        return max;
    }
}
public class Q17 {
    public static void main(String[] args) {
        Maximum3D obj = new Maximum3D();
        obj.input();
        System.out.println("Maximum element = " + obj.findMaximum());
    }
}
# 18
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
# 19
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
# 20
package labsheet3;
import java.util.Scanner;
class StudentMarks {
    int[][] marks;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        marks = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of subjects for student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];
            System.out.println("Enter marks:");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }
    }
    void display() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " marks:");
            for (int mark : marks[i])
                System.out.print(mark + " ");
            System.out.println();
        }
    }
}
public class Q20 {
    public static void main(String[] args) {
        StudentMarks obj = new StudentMarks();
        obj.input();
        obj.display();
    }
}
# 21
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
# 22
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
# 23
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
# 24
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
# 25
package labsheet3;
import java.util.Scanner;
class DiagonalSum {
    int[][] matrix;
    int n;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square matrix size: ");
        n = sc.nextInt();
        if (n <= 0) {
            matrix = new int[0][0];
            return;
        }
        matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
    }
    void calculateSum() {
        int main = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            main += matrix[i][i];
            secondary += matrix[i][n - 1 - i];
        }
        System.out.println("Main diagonal sum = " + main);
        System.out.println("Secondary diagonal sum = " + secondary);
    }
}
public class Q25 {
    public static void main(String[] args) {
        DiagonalSum obj = new DiagonalSum();
        obj.input();
        if (obj.n > 0)
            obj.calculateSum();
        else
            System.out.println("Invalid matrix size.");
    }
}
# 26
package labsheet3;
import java.util.Scanner;
class TriangularMatrix {
    int[][] matrix;
    int n;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square matrix size: ");
        n = sc.nextInt();
        if (n <= 0) {
            matrix = new int[0][0];
            return;
        }
        matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
    }
    void display() {
        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((i <= j ? matrix[i][j] : 0) + " ");
            System.out.println();
        }
        System.out.println("Lower triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((i >= j ? matrix[i][j] : 0) + " ");
            System.out.println();
        }
    }
}
public class Q26 {
    public static void main(String[] args) {
        TriangularMatrix obj = new TriangularMatrix();
        obj.input();
        if (obj.n > 0)
            obj.display();
        else
            System.out.println("Invalid matrix size.");
    }
}
# 27
package labsheet3;
import java.util.Scanner;
class BoundaryMatrix {
    int[][] matrix;
    int rows, cols;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        rows = sc.nextInt();
        cols = sc.nextInt();
        if (rows <= 0 || cols <= 0) {
            matrix = new int[0][0];
            return;
        }
        matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
    }
    void displayBoundary() {
        System.out.println("Boundary elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
public class Q27 {
    public static void main(String[] args) {
        BoundaryMatrix obj = new BoundaryMatrix();
        obj.input();
        if (obj.rows > 0 && obj.cols > 0)
            obj.displayBoundary();
        else
            System.out.println("Invalid matrix dimensions.");
    }
}
# 28
package labsheet3;
import java.util.Scanner;
class MatrixSearch {
    int[][] matrix;
    int rows, cols;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        rows = sc.nextInt();
        cols = sc.nextInt();
        if (rows <= 0 || cols <= 0) {
            matrix = new int[0][0];
            return;
        }
        matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
    }
    void search(int key) {
        boolean found = false;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == key) {
                    System.out.println("Found at row " + (i + 1) + ", column " + (j + 1));
                    found = true;
                }
        if (!found)
            System.out.println("Element not found.");
    }
}
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixSearch obj = new MatrixSearch();
        obj.input();
        if (obj.rows <= 0 || obj.cols <= 0) {
            System.out.println("Invalid matrix dimensions.");
            return;
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        obj.search(key);
    }
}
# 29
package labsheet3;
import java.util.Arrays;
import java.util.Scanner;
class JaggedRowSort {
    int[][] arr;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        if (n <= 0) {
            arr = new int[0][];
            return;
        }
        arr = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter size of row " + (i + 1) + ": ");
            int size = sc.nextInt();
            if (size < 0) {
                System.out.println("Invalid row size.");
                arr[i] = new int[0];
                continue;
            }
            arr[i] = new int[size];
            System.out.println("Enter row elements:");
            for (int j = 0; j < size; j++)
                arr[i][j] = sc.nextInt();
        }
    }
    void sortRows() {
        for (int[] row : arr)
            Arrays.sort(row);
    }
    void display() {
        System.out.println("Sorted jagged array:");
        for (int[] row : arr) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
public class Q29 {
    public static void main(String[] args) {
        JaggedRowSort obj = new JaggedRowSort();
        obj.input();
        obj.sortRows();
        obj.display();
    }
}
# 30
package labsheet3;
import java.util.Scanner;
class SparseMatrix {
    int[][] matrix;
    int rows, cols;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        rows = sc.nextInt();
        cols = sc.nextInt();
        if (rows <= 0 || cols <= 0) {
            matrix = new int[0][0];
            return;
        }
        matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
    }
    void checkSparse() {
        int zeros = 0;
        int total = rows * cols;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == 0)
                    zeros++;
        if (zeros > total - zeros)
            System.out.println("The matrix is a sparse matrix.");
        else
            System.out.println("The matrix is not a sparse matrix.");
    }
}
public class Q30 {
    public static void main(String[] args) {
        SparseMatrix obj = new SparseMatrix();
        obj.input();
        if (obj.rows > 0 && obj.cols > 0)
            obj.checkSparse();
        else
            System.out.println("Invalid matrix dimensions.");
    }
}
