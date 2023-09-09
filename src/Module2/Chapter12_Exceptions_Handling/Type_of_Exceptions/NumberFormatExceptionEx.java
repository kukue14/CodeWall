package Module2.Chapter12_Exceptions_Handling.Type_of_Exceptions;

public class NumberFormatExceptionEx {
    public static void main(String[] args) {
        System.out.println("Start");

        String str = "abc";
        int number = Integer.parseInt(str);
        System.out.println(number);


        System.out.println("End");

    }

}
