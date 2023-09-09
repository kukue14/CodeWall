package Module2.Chapter12_Exceptions_Handling.Type_of_Exceptions;

public class Lesson8_Throw {
    static void makeException() {
        throw new ArithmeticException("My custom exception");
    }

    static void makeException(int a) {
        if (a < 18) {
            throw new ArithmeticException("Because you are younger than 18");
        } else {
            System.out.println("You are vote");
        }
    }

    public static void main(String[] args) {
//        makeException(17);
        makeException();
    }
}
