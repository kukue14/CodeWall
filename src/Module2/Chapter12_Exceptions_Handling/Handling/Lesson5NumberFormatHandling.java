package Module2.Chapter12_Exceptions_Handling.Handling;

public class Lesson5NumberFormatHandling {
    public static void main(String[] args) {
        System.out.println("Before");
        String str = "abc";
        try {
            int number = Integer.parseInt(str);
            System.out.println(number);
        }catch (NumberFormatException e){
            System.out.println(e);
        }



        System.out.println("After");

    }
}
