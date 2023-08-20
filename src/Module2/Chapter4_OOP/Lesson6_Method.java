package Module2.Chapter4_OOP;
/* Method Syntax : <return type> <method name>( <parameter> ) { <implementation> }
* Return Types - primitive datatype, non-primitive datatype
* No-return type - void
*
* Method Type by OOP
*   1. instance method (non-static method)
*   2. static method*/

public class Lesson6_Method {
    void show() {
        System.out.println("This is instance method");
    }

    static void display() {
        System.out.println("This is static method");
    }

    public static void main(String[] args) {
        Lesson6_Method obj = new Lesson6_Method(); // object creation
        obj.show(); // calling method

        display(); // in the same class
        Lesson6_Method.display(); // in the different class
    }

}
