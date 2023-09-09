package Module2.Chapter12_Exceptions_Handling.Handling;

public class Lesson4NullExceptionHandling {
    public static void main(String[] args) {


        System.out.println("Before");
        String name = null;

        try {
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println(e);
        }



        System.out.println("After");

    }
}
