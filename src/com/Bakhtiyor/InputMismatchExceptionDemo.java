import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter 2 integers: ");
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                System.out.println("The number entered is " + Math.addExact(number1,number2));
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                scanner.nextLine();
            }
        } while (continueInput);
    }
}
