package Chapter_3_Array.Lesson_2_TwoDimensionalArray;

import Formats.FormatLite;

public class Two_Dimensional_Array_code {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        String[][] names = new String[3][3];
        names[0][0] = "Aung Aung";
        names[0][1] = "Aung Ba";
        names[0][2] = "Ku Kue";
        names[1][0] = "Zaw Zaw";
        names[1][1] = "Mg Mg";
        names[1][2] = "Mg Zaw";
        names[2][0] = "Mg Ba";
        names[2][1] = "Bo Bo";
        names[2][2] = "Su Su";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }

        FormatLite.Underline('-', 50);
        FormatLite.Title("Using for each loop");
        for (int number[] : numbers) {
            for (int num : number) System.out.print(num + "\t");
            System.out.println();
        }
    }
}
