package Module2.Chapter12_Exceptions_Handling.Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson3InputMisMatchHandling {
    public static void main(String[] args) {
        System.out.print("Enter your id: ");

        try {
            int userInput = new Scanner(System.in).nextInt();
            System.out.println(userInput);
        }catch (InputMismatchException e){
            System.out.println(e);
        }

        System.out.println("End");
    }
}
