package Module2.Chapter4_OOP.DifferentDirectory;

import Module2.Chapter4_OOP.Lesson12_AccessModifier;
import Module2.Chapter4_OOP.Lesson13_Constructor;

public class AccessModifierCall {
    public static void main(String[] args) {
        Lesson12_AccessModifier obj = new Lesson12_AccessModifier();
        System.out.println(obj.variable1);
//        System.out.println(obj.variable2); // protected
//        System.out.println(obj.variable3); // private
//        System.out.println(obj.variable4); // default
    }
}
