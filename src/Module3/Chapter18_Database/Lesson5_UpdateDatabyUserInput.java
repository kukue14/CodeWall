package Module3.Chapter18_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static Module3.Chapter18_Database.MyProjectUtils.*;


public class Lesson5_UpdateDatabyUserInput {
    private static void update(String name,int id){
        try {
            Connection connection = DriverManager.getConnection(URL, userName,"");
            Statement statement = connection.createStatement();
            statement.executeUpdate("update students set name='"+name+"' where id="+id);
            System.out.println("success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter name you want to update: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter id you want to update: ");
        int id = new Scanner(System.in).nextInt();
        update(name,id);
    }
}
