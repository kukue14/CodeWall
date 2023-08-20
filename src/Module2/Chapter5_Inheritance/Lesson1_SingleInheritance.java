package Module2.Chapter5_Inheritance;

public class Lesson1_SingleInheritance {
    public static void main(String[] args) {
        System.out.println(new Child().b);
        System.out.println(new Parent().a);
        System.out.println(new Child().a);
    }
}

class Parent {
    int a = 1;
}

class Child extends Parent{
    int b = 2;
}