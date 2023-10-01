package module3.chapter18database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static Module3.Chapter18_Database.MyProjectUtils.*;


//alter table students modify column id int auto_increment;

public class Lesson3_InsertDatabyUserInput {
    static void insert(String name,int age){
        try {
            Connection connection = DriverManager.getConnection(URL, userName,"");
            Statement statement = connection.createStatement();


            statement.executeUpdate("insert into students(name,age)values('"+name+"',"+age+");");

            System.out.println("success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter age: ");
        int age = new Scanner(System.in).nextInt();
        insert(name,age);
    }
}
