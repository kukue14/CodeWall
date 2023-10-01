package Module3.Chapter18_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static Module3.Chapter18_Database.MyProjectUtils.*;


public class Lesson4_UpdateDataToDatabase {
    private static void update(){
        try {
            Connection connection = DriverManager.getConnection(URL, userName,"");
            Statement statement = connection.createStatement();
            statement.executeUpdate("update students set name='Aung Ko' where id=3");
            System.out.println("success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        update();
    }
}
