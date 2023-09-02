package Module2.Chapter10_Strings;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.Arrays;

public class Lesson3_SubString {
    public static void main(String[] args) {
        String name = "Ku Kue";
        System.out.println(name.substring(3));
        System.out.println(name.substring(3, 5) + " Kue");

        String fullName = "Thu Htet Naing";
        String[] arrayName = fullName.split(" ");
        System.out.println(Arrays.toString(arrayName));
        System.out.println(arrayName[arrayName.length - 1]);
        System.out.println(arrayName[0]);
    }
}

// User ဆီက input တောင်း welcome <name> ပြန်ထုတ်ပေး