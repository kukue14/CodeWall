package Module2.Chapter5_Inheritance;

public class Lesson3_HierarchicalInheritance {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        System.out.println(child2.a);
        System.out.println(child2.b);

        Child3 child3 = new Child3();
        System.out.println(child3.a);
        System.out.println(child3.c);
    }
}

class Parent2 {
    int a = 1;
}

class Child2 extends Parent2 {
    int b = 3;
}

class Child3 extends Parent2 {
     int c = 4;
}
