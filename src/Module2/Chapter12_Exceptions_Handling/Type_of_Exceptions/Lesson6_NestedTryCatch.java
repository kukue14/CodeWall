package Module2.Chapter12_Exceptions_Handling.Type_of_Exceptions;

public class Lesson6_NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("Start");
        int a = 12;
        int b = 6;

        try {
            try {
                int result = a/b;
                System.out.println(result);
            } catch(ArithmeticException e) {
                System.out.println("This is the first exception.");
            }

            try {
                int numbers[] = new int[10];
                System.out.println(numbers[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This is the second exception.");
            }

            String name = null;
            System.out.println(name.toUpperCase());

            System.out.println("This is ok.");

        } catch (Exception e) {
            System.out.println("This is general exception.");
        }

        System.out.println("End");
    }
}
