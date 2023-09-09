package Module2.Chapter12_Exceptions_Handling;

public class Lesson5_MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Start");

        int a = 12;
        int b = 2;
        try {
            int result = a/b;
            System.out.println(result);

            int number[] = new int[5];
            System.out.println(number[8]);

            String name = null;
            System.out.println(name.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("This is null pointer exception.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is ArrayIndexOutOfBound Exception.");
        } catch (Exception e) {
            System.out.println("This is Exception.");
        } finally {
            System.out.println("This is Final.");
        }
        System.out.println("End");
    }
}
