package Module2.Chapter12_Exceptions_Handling.Type_of_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionEx {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int userInput = new Scanner(System.in).nextInt();
        System.out.println(userInput);

        System.out.println("the next operation");
    }
}
