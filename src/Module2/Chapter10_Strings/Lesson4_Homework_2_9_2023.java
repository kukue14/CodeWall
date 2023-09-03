package Module2.Chapter10_Strings;

import java.util.Scanner;

public class Lesson4_Homework_2_9_2023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        String[] arrayName = name.split(" ");
        System.out.println("Hello, " + arrayName[0] + "\nNice to meet you!");
    }
}


