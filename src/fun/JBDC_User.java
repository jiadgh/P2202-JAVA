package fun;
import classlib.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JBDC_User {

    public static List readStudentData() {
         List<User> userList = new ArrayList<>();
         Connection connection = JBDC_Control.getConnection("root","123456");

        try {
            Statement  statement = connection.createStatement();
            String sql = "SELECT * FROM user";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                userList.add(new User(
                        rs.getInt(1),//ID
                        rs.getString(2), //user
                        rs.getString(3),//pass
                        rs.getString(4),//phone
                        rs.getString(5),//avatar
                        rs.getInt(6),//borrownum
                        rs.getString(7),//borrowbooklist
                        rs.getInt(7),//booklistnum
                        rs.getString(8),//a1
                        rs.getString(9),//a2
                        rs.getString(10)//a3
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userList;
    }

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList = readStudentData();
        for (User user : userList){
            System.out.println(user);
        }
    }

    public static User querryUserbyPhone(String phone) {
        List<User> userList =  readStudentData();
        for (User user:userList){
            if (user.getPhone().equals(phone)){

                return user;
            }
        }
        return null;
    }
}
