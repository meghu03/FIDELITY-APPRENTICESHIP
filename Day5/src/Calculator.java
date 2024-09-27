import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    public int Addition(int a, int b) {
        return a + b;
    }
    public int Subtraction(int a, int b) {
        return a - b;
    }
    public int Multiplication(int a, int b) {
        return a * b;
    }
    public double Division(int a, int b, double[] remainder) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not possible.");
        }
        remainder[0] = a % b;
        return a /(double) b;
    }
}
class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        try {
            System.out.println("Enter the operator:");
            String operator = sc.nextLine();
            System.out.println("Enter the operands:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (operator) {
                case "+":
                    System.out.println("Result of " + a + " + " + b + " is " + calc.Addition(a, b));
                    break;
                case "-":
                    System.out.println("Result of " + a + " - " + b + " is " + calc.Subtraction(a, b));
                    break;
                case "*":
                    System.out.println("Result of " + a + " * " + b + " is " + calc.Multiplication(a, b));
                    break;
                case "/":
                    double[] remainder = new double[1]; // Array to hold remainder
                    double quotient = calc.Division(a, b, remainder);
                    System.out.println("Result of " + a + " / " + b + " is " + (int) quotient);
                    System.out.println("Remainder = " + (int) remainder[0]);
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers for operands.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}