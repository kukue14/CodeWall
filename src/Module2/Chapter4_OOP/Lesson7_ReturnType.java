package Module2.Chapter4_OOP;

import java.util.Scanner;

public class Lesson7_ReturnType {
    static int sum() {
        return (8 + 5);
    }

    static String schoolName() {
        String schoolName = "Code Wall";
        System.out.println(schoolName);
        return "CodeWall";
    }
    public static void main(String[] args) {
        int num = sum();
        System.out.println(num);
        System.out.println(sum());

        System.out.println(schoolName());
    }
}
