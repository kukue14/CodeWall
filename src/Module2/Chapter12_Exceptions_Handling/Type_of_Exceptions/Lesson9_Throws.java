package Module2.Chapter12_Exceptions_Handling.Type_of_Exceptions;

import java.io.FileNotFoundException;

public class Lesson9_Throws {
    static void result(int a) throws FileNotFoundException /*Checked Exception*/{
        if (a % 2 == 0) {
            throw new FileNotFoundException("Because of something");
        }
        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            result(10);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
