import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter mark for subject " + i + ": ");
            total += sc.nextInt();
        }

        double average = total / 5.0;
        char grade;

        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);
    }
}

