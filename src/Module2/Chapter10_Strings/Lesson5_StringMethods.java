package Module2.Chapter10_Strings;

import Formats.FormatLite;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lesson5_StringMethods {
    public static void main(String[] args) {
        System.out.println("Ku Kue".getClass());
        System.out.println("Ku Kue".getClass().getName());
        System.out.println("Ku Kue".getClass().getSimpleName());
        FormatLite.Underline('=', 30);

        System.out.println("Ku Kue".contains("Ku"));
        System.out.println("kukue".equals("KUKUE"));
        System.out.println("kukue".equalsIgnoreCase("KUKUE"));
        FormatLite.Underline('=', 30);

        System.out.println("a".compareTo("b"));
        System.out.println("c".compareTo("C"));
        System.out.println("A".compareTo("b"));
        System.out.println("a".compareTo("C"));
        FormatLite.Underline('-', 30);
        System.out.println("a".compareToIgnoreCase("b"));
        System.out.println("c".compareToIgnoreCase("C"));
        System.out.println("A".compareToIgnoreCase("b"));
        System.out.println("a".compareToIgnoreCase("C"));
        FormatLite.Underline('=', 30);

        System.out.println("Mr.Thu Htet Naing".startsWith("Mr."));
        System.out.println("Mrs.Soe Sett Lynn".startsWith("Mrs."));
        System.out.println("kuku12334@gmail.com".endsWith(".com"));
        FormatLite.Underline('=', 30);

        System.out.println("Ku Kue".charAt(3));
        System.out.println("Ku Kue".indexOf("K"));
        System.out.println("Ku Kue".lastIndexOf("K"));
        FormatLite.Underline('=', 30);

        String strBlank = " ";
        String strEmpty = "";
        System.out.println(strBlank.isBlank()); // true
        System.out.println(strBlank.isEmpty()); // false
        System.out.println(strEmpty.isBlank()); // true
        System.out.println(strEmpty.isEmpty()); // true
        FormatLite.Underline('=', 30);

        System.out.println(" Ku Kue  ".length());
        System.out.println(" Ku Kue  ".trim());
        System.out.println(" Ku Kue  ".trim().length());

    }
}
