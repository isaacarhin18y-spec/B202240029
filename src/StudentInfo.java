import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //student full name
        System.out.println("Enter your full name: ");
        String StudName = input.nextLine();

        //Index Number
        System.out.println("Enter your Index Number: ");
        String StudIndex = input.nextLine();

        //Age
        System.out.println("Enter your age: ");
        byte StudAge = input.nextByte();

        input.nextLine();
        //Gender
        System.out.println("Are you Male or Female? ");
        String StudGender = input.nextLine();

        //Department
        System.out.println("Enter your Department: ");
        String StudDepartment = input.nextLine();

        //Level
        System.out.println("Enter your Level: ");
        short StudLevel = input.nextShort();

        //GPA
        System.out.println("Enter your GPA: ");
        float StudGPA = input.nextFloat();


        System.out.println("=========STUDENT PROFILE==========");
        System.out.println("Name: "+StudName);
        System.out.println("Index: "+StudIndex);
        System.out.println("Age: "+StudAge);

        if (StudGender.equalsIgnoreCase("male")){
            System.out.println("Gender: M");
        } else {
            System.out.println("Gender: F");
        }

        System.out.println("Department: "+StudDepartment);
        System.out.println("Level: "+StudLevel);
        System.out.println("GPA: "+StudGPA);
        System.out.println();
        System.out.println();

        if (StudAge >=18){
            System.out.println("Adult Status: Yes");
        } else {
            System.out.println("Adult Status: No");
        }

        if (StudGPA >=3.5){
            System.out.println("Academic Class: First Class");
        } else if (StudGPA >=3.0) {
            System.out.println("Academic Class:	Second Class Upper");
        } else if (StudGPA >=2.5) {
            System.out.println("Academic Class:	Second Class Lower");
        } else if (StudGPA <2.5) {
            System.out.println("Academic Class:	Pass");
        } else {
            System.out.println("The GPA you entered earlier should fall between 0 to 4.");
            System.out.println("Try again");
        }
        System.out.println("===========================");
    }
}
