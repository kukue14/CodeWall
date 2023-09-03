package Module2.Chapter10_Strings;

import java.util.Scanner;

public class Lesson6_ContainsExercise {
    public static void main(String[] args) {
        String foods[] = {"meat", "strawberry", "grape", "banana", "HotPot", "HotDog", "Buffet", "Sea Food", "Malar Xiankaw", "Sushi"};
        Scanner input = new Scanner(System.in);
        System.out.print("Search for foods : ");
        String search = input.nextLine();

        System.out.println("You can order the following : ");
        for (String aFood : foods) {
            if (aFood.contains(search)) {
                System.out.println(aFood);
            }
        }
    }

}
