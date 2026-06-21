import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect student information
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Index Number: ");
        String indexNumber = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter Gender (M/F): ");
        String gender = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Level: ");
        int level = scanner.nextInt();

        double gpa;
        while (true) {
            System.out.print("Enter GPA (0.0 - 4.0): ");
            gpa = scanner.nextDouble();
            if (gpa >= 0.0 && gpa <= 4.0) {
                break;
            } else {
                System.out.println("Error: GPA must be between 0.0 and 4.0. Please try again.");
            }
        }

        // Determine adult status
        String adultStatus = (age >= 18) ? "YES" : "NO";

        // Determine academic classification
        String academicClass;
        if (gpa >= 3.5 && gpa <= 4.0) {
            academicClass = "First Class";
        } else if (gpa >= 3.0 && gpa < 3.5) {
            academicClass = "Second Class Upper";
        } else if (gpa >= 2.5 && gpa < 3.0) {
            academicClass = "Second Class Lower";
        } else {
            academicClass = "Pass";
        }

        // Display formatted student profile
        System.out.println("\n===== STUDENT PROFILE =====");
        System.out.println("Name:         " + fullName);
        System.out.println("Index:        " + indexNumber);
        System.out.println("Age:          " + age);
        System.out.println("Gender:       " + gender);
        System.out.println("Department:   " + department);
        System.out.println("Level:        " + level);
        System.out.printf("GPA:          %.2f%n", gpa);
        System.out.println("Adult Status: " + adultStatus);
        System.out.println("Academic Class: " + academicClass);
        System.out.println("===========================");

        scanner.close();
    }
}
