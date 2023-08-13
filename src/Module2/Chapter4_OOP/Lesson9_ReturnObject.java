package Module2.Chapter4_OOP;

public class Lesson9_ReturnObject {
    static void calculate(int a, int b) {
        System.out.println(a + b);
    }

    static void fullName(String firstName, String midName, String lastName) {
        System.out.println(firstName + " " + midName + " " + lastName);
    }
    
    static double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        calculate(10, 20);
        calculate(100, 20);

        fullName("Thu", "Htet", "Naing");
        System.out.println(sum(5, 5.2, 3.4));
    }
}
