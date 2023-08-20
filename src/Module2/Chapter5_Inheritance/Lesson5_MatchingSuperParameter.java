package Module2.Chapter5_Inheritance;

public class Lesson5_MatchingSuperParameter {
    public static void main(String[] args) {
        Child5 child5 = new Child5(20);
        Child5 child5a = new Child5(10);
    }
}

class Parent4 {
    public Parent4(int num) {
        System.out.println("Parent constructor is working with " + num);
    }
}

class Child5 extends Parent4{
    public Child5(int num) {
        super(num);
        System.out.println("Child constructor is working.");
    }
}
