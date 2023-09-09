package Module2.Chapter12_Exceptions_Handling;

public class Lesson4_Finally {
    public static void main(String[] args) {

        try {
            int result = 4/0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is final.");
        }
    }
}
