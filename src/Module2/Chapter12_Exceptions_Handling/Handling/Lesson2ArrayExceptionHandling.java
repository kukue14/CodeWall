package Module2.Chapter12_Exceptions_Handling.Handling;

public class Lesson2ArrayExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Before");
        int numbers[] = {1,2,4,43,34};

        try {
            numbers[9] = 23;
            System.out.println(numbers[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("After");
    }
}
