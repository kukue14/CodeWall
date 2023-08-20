package Module2.Chapter5_Inheritance;

public class Lesson2_MultiLevelInheritance {
    public static void main(String[] args) {
        Parent1 parent1 = new Parent1();
        System.out.println(parent1.a + parent1.b);

        Child1 child1 = new Child1();
        System.out.println(child1.a + child1.b + child1.c);
    }
}

class GrandParent {
    int a = 1;
}

class Parent1 extends GrandParent {
    int b = 3;
}

class Child1 extends Parent1 {
    int c = 4;
}


