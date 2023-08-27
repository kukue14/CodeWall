package Module2.Chapter4_OOP;

public class Lesson1_Variables {
    int number1 = 40; // instance variable
    static int number2 = 45; //static variable
    String str = "CodeWall";

    public static void main(String[] args) {
        System.out.println(number2);
        Lesson1_Variables obj = new Lesson1_Variables();
        System.out.println(obj.number1);
    }
}
