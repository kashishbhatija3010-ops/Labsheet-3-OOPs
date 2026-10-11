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
