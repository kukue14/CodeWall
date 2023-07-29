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

    public static void AlignTitle(String title) {
        System.out.print("<");
        for (int i = 30; i>title.length(); i--) {
            System.out.print("=");
        }
    }

    public static void main(String[] args) {
        FormatLite.AlignTitle("Hello");
    }
}
