package Module1.Chapter3_Array.Lesson1_NormalArray;

/* Syntax
    for(<data type> variable : array_variable) { <implementation> }
 */
public class Array_For_Each_Loop_code {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int number : numbers) {
            if (number % 2 == 0)
                System.out.println(number);
        }
    }
}
