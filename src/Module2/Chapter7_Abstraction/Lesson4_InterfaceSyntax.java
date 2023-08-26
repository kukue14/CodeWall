package Module2.Chapter7_Abstraction;

public class Lesson4_InterfaceSyntax {
    public static void main(String[] args) {
        Testable testable = new Testable() {
            @Override
            public void cal() {
                System.out.println("Task1");
            }
        };
        testable.cal();
        testable.eat();
        Testable.drink();

        Testable testable1  = new Testable() {
            @Override
            public void cal() {
                System.out.println("Task2");
            }
        };
        testable1.cal();
        testable1.eat();
        Testable.drink();
    }
}

interface Testable {
    void cal();

    default void eat() {

    }

    static void drink() {

    }
}
