package Module2.Chapter7_Abstraction;

public class Lesson3_AbstractMedium {
    public static void main(String[] args) {
        People people = new People();
        people.doIt();

        Person3 child3 = new Child3();
        child3.calculate();
        child3.eat();

        Person3 child4 = new Child4();
        child4.calculate();
        child4.eat();

        Person3 person3 = new Person3() {
            @Override
            void calculate() {
                System.out.println("Task3");
            }
        };
        person3.calculate();
        person3.eat();

        Person3 person31 = new Person3() {
            @Override
            void calculate() {
                System.out.println("Task4");
            }
        };
        person31.calculate();
        person31.eat();
    }
}

class People {
    void doIt() {
        System.out.println("blah blah");
    }

}

abstract class Person3 {
    abstract void calculate();

    void eat() {
        System.out.println("I'm eating.");
    }
}

class Child3 extends Person3 {
    @Override
    void calculate() {
        System.out.println("Task1");
    }

    void eat() {
        System.out.println("This is eating1");
    }
}

class Child4 extends Person3 {
    @Override
    void calculate() {
        System.out.println("Task2");
    }

    void eat() {
        System.out.println("This is eating2");
    }
}
