import java.util.Scanner;
public class SquareCube {
    public static double FindSquare(double num) {
        return num*num;
    }
    public static double FindCube(double num) {
        return num * num * num;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        double inputnumber = scanner.nextDouble();
        double square = SquareCube.FindSquare(inputnumber);
        double cube = SquareCube.FindCube(inputnumber);
        System.out.println("Square of " + inputnumber + " is " + square);
        System.out.println("Cube of " + cube + " is " + cube);
        scanner.close();
    }
}
