package Module3.Chapter18_Database;

import java.sql.*;

import static Module3.Chapter18_Database.MyProjectUtils.*;

public class Lesson1_SelectDataFromDatabase {
    static void getData(){
        try {

            Connection connection = DriverManager.getConnection(URL,userName,password);
            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("select * from student_info");


            String str = "";
            while (resultSet.next()){
                str = str.concat("id is "+resultSet.getInt("id")+"\t"+"name is "+resultSet.getString("name")+" \n");
            }

            System.out.println(str);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {


        getData();

    }
}





