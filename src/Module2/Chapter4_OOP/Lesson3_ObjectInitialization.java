package Module2.Chapter4_OOP;

public class Lesson3_ObjectInitialization {
    int number1;
    String str;

    public static void main(String[] args) {
       Lesson3_ObjectInitialization obj1 = new Lesson3_ObjectInitialization();
       obj1.number1 = 30;
       obj1.str = "Hello";

       Lesson3_ObjectInitialization obj2 = new Lesson3_ObjectInitialization();
       obj2.number1 = 40;
       obj2.str = "World";

        System.out.println(obj1.number1);
        System.out.println(obj2.number1);
    }
}
