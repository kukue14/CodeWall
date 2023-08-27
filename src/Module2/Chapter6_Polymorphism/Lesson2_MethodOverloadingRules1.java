package Module2.Chapter6_Polymorphism;

public class Lesson2_MethodOverloadingRules1 {
    static void show(int a) {
        System.out.println(a);
    }

    static void show(int a, int b) {
        System.out.println(a + b);
    }

    static void show(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        show(4);
        show(4, 6);
        show(4, 5,6);
    }
}
