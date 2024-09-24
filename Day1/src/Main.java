import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.print("Enter student's marks");
        double marks = scanner.nextDouble();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
            return;
        }

        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Student's marks: " + marks);
        System.out.println("Grade:" + grade);

        String feedback;
        switch(grade) {
            case "A":
                feedback = "Excellent";
                break;
            case "B":
                feedback = "Good";
                break;
            case "C":
                feedback = "Satisfactory";
                break;
            case "D":
                feedback = "Needs improvement";
                break;
            case "F":
                feedback = "Fail";
                break;
            default:
                feedback = "Invalid grade";
                System.out.println("Feedback: "+feedback);
                scanner.close();
        }
    }
}








