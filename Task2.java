import java.util.Scanner;

class Markscalculator {

    static int average;

    static void Average(int totalMarks, int sub) {
        average = totalMarks / sub;
        System.out.println("Average: " + average);
    }

    static void Grade() {
        char grade;
        if (average>0 && average<=100){

        if (average > 90 && average <= 100) {
            grade = 'A';
        } else if (average > 80 && average <= 90) {
            grade = 'B';
        } else if (average > 70 && average <= 80) {
            grade = 'C';
        } else if (average > 60 && average <= 70) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Grade Scored: " + grade);
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int sub = obj.nextInt();

        int totalMarks = 0;
        int marks[] = new int[sub];

        for (int i = 0; i < sub; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = obj.nextInt();
            totalMarks += marks[i];
        }

        System.out.println("Total = " + totalMarks);

        Average(totalMarks, sub);
        Grade();

        obj.close();
    }
}