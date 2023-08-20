package Module2.Chapter5_Inheritance;

public class Lesson4_MatchingSuper {
    public static void main(String[] args) {
        Child4 child4 = new Child4();
    }
}

class Parent3 {
    public Parent3() {
        System.out.println("This is Parent.");
    }
}

class Child4 extends Parent3 {
    public Child4() {
        super();
        System.out.println("This is Child.");
    }
}
