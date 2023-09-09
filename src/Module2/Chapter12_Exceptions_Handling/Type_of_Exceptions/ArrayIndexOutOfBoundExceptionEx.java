package Module2.Chapter12_Exceptions_Handling.Type_of_Exceptions;

public class ArrayIndexOutOfBoundExceptionEx {
    public static void main(String[] args) {

        System.out.println("before exception");
        int numbers[] = {1,2,4,43,34};

            numbers[9] = 23;
            System.out.println(numbers[9]);

        System.out.println("something");

    }
}

