package Module2.Chapter4_OOP;

import java.util.Scanner;

public class Lesson8_Returnif {
    static String validDate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        if (age < 18) return "cannot";
        else return "can";
    }

    static Person myMethod() {
        Person obj = new Person();
        return obj; // return new Person();
    }

    public static void main(String[] args) {
        System.out.println("You " + validDate() + " vote.");
        System.out.println(myMethod().a);
        System.out.println(myMethod().name);
        System.out.println(myMethod().obj.subName);
    }
}


class Person {
    int a = 5;
    String name = "Ku Kue";
    Name obj = new Name();

}

class Name {
    String subName = "Hi";
}
