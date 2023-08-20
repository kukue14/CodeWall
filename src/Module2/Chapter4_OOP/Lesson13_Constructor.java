package Module2.Chapter4_OOP;

public class Lesson13_Constructor {
    // Default Constructor : Lesson13_Constructor() {}
    Lesson13_Constructor() {
        System.out.println("Zero argument constructor is working.");
    }

    Lesson13_Constructor(String name) {
        System.out.println("Parameterized constructor is working.");
    }

    public static void main(String[] args) {
        Lesson13_Constructor obj = new Lesson13_Constructor();
//        System.out.println(obj);

        Lesson13_Constructor obj1 = new Lesson13_Constructor("Aung");
//        System.out.println(obj1);
    }
}
