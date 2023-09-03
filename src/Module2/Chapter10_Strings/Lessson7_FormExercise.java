package Module2.Chapter10_Strings;

import Formats.FormatLite;

import java.util.Scanner;

public class Lessson7_FormExercise {
    public static void main(String[] args) {
        String name, email;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your name : ");
            name = input.nextLine();
            if (name.startsWith("U") || name.startsWith("Daw")) break;
            System.out.println("Invalid Tpye! Please, type U / Daw.");
        }

        while (true) {
            System.out.print("Enter your email : ");
            email = input.next();
            if (email.endsWith(".com") || email.endsWith(".org")) break;
            System.out.println("Invalid Type! Please, check your email.");
        }

        System.out.println();
        FormatLite.Title("Thank you for your Register!");
        System.out.println("Your name is : " + name);
        System.out.println("Your email is : " + email);
    }
}
