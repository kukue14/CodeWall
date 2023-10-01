package Module3.Chapter18_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static Module3.Chapter18_Database.MyProjectUtils.*;


public class Lesson2_InsertDataIntoDatabase {
    static void insert(){
        try {
            Connection connection = DriverManager.getConnection(URL, userName,"");
            Statement statement = connection.createStatement();




            statement.executeUpdate("insert into students values(2,\"Kyaw Kyaw\",20);");



            System.out.println("success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        insert();
    }
}
