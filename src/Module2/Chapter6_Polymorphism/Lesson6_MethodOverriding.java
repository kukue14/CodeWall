package Module2.Chapter6_Polymorphism;

public class Lesson6_MethodOverriding {
    public static void main(String[] args) {
        Child child = new Child();
        child.doSomething(4);
    }
}

class Parent{
    void doSomething(int a){
        System.out.println("Parent");
    }
}

class Child extends Parent{



    @Override
    void doSomething(int num) {
        super.doSomething(num);
        System.out.println("Child");
    }
}
