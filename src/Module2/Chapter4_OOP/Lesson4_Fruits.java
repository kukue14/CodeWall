package Module2.Chapter4_OOP;

public class Lesson4_Fruits {
    String name;
    String color;
    String size;
    public static void main(String[] args) {
        Lesson4_Fruits fruit1 = new Lesson4_Fruits();
        fruit1.name = "Apple";
        fruit1.color = "Red";
        fruit1.size = "Small";

        System.out.println(fruit1.name);

        Lesson4_Fruits fruit2 = new Lesson4_Fruits();
        fruit2.name = "Orange";
        fruit2.color = "Orange";
        fruit2.size = "Small";

        System.out.println(fruit2.name);

    }
}
