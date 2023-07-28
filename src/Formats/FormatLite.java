package Formats;

public class FormatLite {
    public static void Underline(char style, int length) {
    for (int i = 0; i < length; i++)
        System.out.print(style);
    System.out.println();
    }

    public static void Title(String title) {
        System.out.println("<----------" + title + "---------->");
    }
}
