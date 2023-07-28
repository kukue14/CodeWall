package Chapter_3_Array.Lesson_2_TwoDimensionalArray;

public class Two_Dimensional_Array_code {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
