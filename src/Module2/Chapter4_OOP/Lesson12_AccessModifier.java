package Module2.Chapter4_OOP;

import Formats.FormatLite;
import org.w3c.dom.ls.LSOutput;

public class Lesson12_AccessModifier {
    public int variable1 = 10;
    protected int variable2 = 12;
    private int variable3 = 13;
    int variable4 = 15;

    public static void main(String[] args) {
        Lesson12_AccessModifier obj = new Lesson12_AccessModifier();
        System.out.println(obj.variable1);
        System.out.println(obj.variable2);
        System.out.println(obj.variable3);
        System.out.println(obj.variable4);
        FormatLite.Underline('=', 50);
        callModifier callObj = new callModifier();
        callObj.show();
    }
}

class callModifier {

    void show() {
        Lesson12_AccessModifier obj = new Lesson12_AccessModifier();
        System.out.println(obj.variable1);
        System.out.println(obj.variable2);
//        System.out.println(obj.variable3); // private
        System.out.println(obj.variable4);
    }
}
