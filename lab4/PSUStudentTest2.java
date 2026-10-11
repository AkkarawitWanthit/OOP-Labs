package lab4;

import java.util.Scanner;

public class PSUStudentTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("GPA must be between 0.0 and 4.0");
        } else {
            PSUStudent p1 = new UndergradeStudent(age, gpa);
            PSUStudent p2 = new GradeStudent(age, gpa);

            System.out.println("UndergradStudent created");
            System.out.println("GradeStudent created");
        }

        sc.close();
    }
}