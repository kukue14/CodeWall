package Module2.Chapter12_Exceptions_Handling;

public class Lesson1_ArithmeticHandling {
    public static void main(String[] args) {
        try {
            int result = 7/0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
