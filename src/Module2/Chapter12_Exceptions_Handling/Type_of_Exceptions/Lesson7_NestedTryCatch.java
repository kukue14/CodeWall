package Module2.Chapter12_Exceptions_Handling.Type_of_Exceptions;

public class Lesson7_NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("Start");
        int a = 45;
        int b = 0;

        try {
            try {
                try {
                    int result = a/b;
                    System.out.println(result);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("First Handling");
                }
            } catch (NullPointerException e) {
                System.out.println("Second Handling");
            }
        } catch (Exception e) {
            System.out.println("General Handling");
        }
        System.out.println("End");
    }
}
