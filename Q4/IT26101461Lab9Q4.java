import java.util.Scanner;

public class IT26101461Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }

    public static char findGrades(double finalMark) {

        // Put the exact grade boundaries from your lab sheet here.

        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 65) {
            return 'B';
        } else if (finalMark >= 55) {
            return 'C';
        } else if (finalMark >= 45) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println("Name: " + name);
        System.out.println("Final Mark: " + finalMark);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Student " + i);

            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            double exam = input.nextDouble();

            double finalMark = calcFinalMark(assignment, exam);

            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);

            input.nextLine();
        }
    }
}