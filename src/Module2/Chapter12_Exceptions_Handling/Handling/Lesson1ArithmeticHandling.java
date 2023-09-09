package Module2.Chapter12_Exceptions_Handling.Handling;

public class Lesson1ArithmeticHandling {
    public static void main(String[] args) {
        System.out.println("Before");

        int a = 7;
        int b = 0;

        try{
            int result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e){
//            System.out.println(e);
//            System.out.println(e.getCause());
//            System.out.println(e.getMessage());
//            System.out.println("This is an exception");
            int result = a/(b+2);
            System.out.println(result);

        }

        System.out.println("After");

    }
}
