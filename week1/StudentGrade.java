import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        String grade;

        if (marks >= 80) {
            grade = "A";
        } 
        else if (marks >= 60) {
            grade = "B";
        } 
        else if (marks >= 40) {
            grade = "C";
        } 
        else {
            grade = "Fail";
        }

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

        input.close();
    }
}