package Module2.Chapter7_Abstraction;

public class Lesson2_AbstractSyntax {
    public static void main(String[] args) {
        Person2 person2 = new Person2() {
            @Override
            void sub() {
                System.out.println("This is task one");
            }
        };

        person2.sub();

        Person2 person21 = new Person2() {
            @Override
            void sub() {
                System.out.println("This is task two");
            }
        };

        person21.sub();

        new Person2() {

            @Override
            void sub() {
                System.out.println("This is task three");
            }
        }.sub();
    }

}

abstract class Person2 {
    abstract void sub();
}