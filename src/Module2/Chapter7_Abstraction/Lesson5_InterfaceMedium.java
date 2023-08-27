package Module2.Chapter7_Abstraction;

public class Lesson5_InterfaceMedium {
    public static void main(String[] args) {
        Testable2 testable2 = new Testable2() {
            @Override
            public void cal() {
                System.out.println("Task in Parent Interface.");
            }
        };
        testable2.cal();

        Child5 child5 = new Child5();
        child5.cal();

        Testable2 childLite = new Child5();
        childLite.cal();

        Child6 child6 = new Child6() {
            @Override
            public void cal() {
                System.out.println("Task2");
            }
        };
        child6.cal();
    }
}

interface Testable2 {
    void cal();
}

class Child5 implements Testable2 {
    @Override
    public void cal() {
        System.out.println("Task1");
    }
}

abstract class Child6 implements Testable2 {

}
