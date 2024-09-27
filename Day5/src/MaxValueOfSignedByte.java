import java.util.Scanner;
class InvalidByteValueException extends Exception {
    public InvalidByteValueException(String message) {
        super(message);
    }
}

public class MaxValueOfSignedByte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte number = 0;
        try {
            System.out.print("Enter a value for number: ");
            number = sc.nextByte();
            if (number < 1 || number > 125) {
                throw new InvalidByteValueException("Invalid input. Please enter a valid value ");
            }
            System.out.println("Value of number: " + number);
            number = Byte.MAX_VALUE;
            System.out.println("Largest value stored in a signed byte: " + number);
        } catch (InvalidByteValueException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid byte value.");
        } finally {
            sc.close();
        }
    }
}
