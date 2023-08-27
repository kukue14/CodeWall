package Module2.Chapter6_Polymorphism;

public class Lesson4_MethodOverloadingRule2 {
    static void calculate(int a) {
        System.out.println("This is integer.");
    }

    static void calculate(double b) {
        System.out.println("This is double.");
    }

    public static void main(String[] args) {
        calculate(3);
        calculate(4.5);
    }
}
