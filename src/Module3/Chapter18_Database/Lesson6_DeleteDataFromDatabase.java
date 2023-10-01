package Module3.Chapter18_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static Module3.Chapter18_Database.MyProjectUtils.*;


public class Lesson6_DeleteDataFromDatabase {
    public static void main(String[] args) {

        System.out.print("Enter a row number you want to delete: ");
        try {
            Connection connection = DriverManager.getConnection(URL, userName,"");
            Statement statement = connection.createStatement();
            int userInputNumber = new Scanner(System.in).nextInt();
            statement.executeUpdate("delete from students where id="+userInputNumber);
            System.out.println("success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
