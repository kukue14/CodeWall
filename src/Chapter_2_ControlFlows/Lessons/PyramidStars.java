package Chapter_2_ControlFlows.Lessons;

import Formats.FormatLite;

public class PyramidStars {
    public static void main(String[] args) {

//        Reverse PyramidStars
        FormatLite.Title("Reverse Pyramid Stars");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--)
                System.out.print(" * ");
            System.out.println();
        }
//        PyramidStars
        FormatLite.Title("Pyramid Stars");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" * ");
            System.out.println();
        }
        FormatLite.Title("Reverse Pyramid Stars on Right");
                for (int i = 0; i < 5; i++) {
                    for (int k = 1; k <= i; k++)
                        System.out.print("   ");
                    for (int j = 5; j > i; j--)
                        System.out.print(" * ");
                    System.out.println();
                }

        FormatLite.Title("Pyramid Stars on Right");
        for (int i = 0; i < 5; i++) {
            for (int k = 4; k > i; k--)
                System.out.print("   ");
            for (int j = 0; j <= i; j++)
                System.out.print(" * ");
            System.out.println();
        }
        FormatLite.Underline('=', 50);
        FormatLite.Title("Using if");
//        Using if
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= 6 - i) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
        FormatLite.Underline('-', 50);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}

