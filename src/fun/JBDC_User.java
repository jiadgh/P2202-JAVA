package fun;
import classlib.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JBDC_User {

    /**
     * 读取学生数据
     *
     * @return {@link List}
     */
    public static List readUserData() {
         List<User> userList = new ArrayList<>();
         Connection connection = JBDC_Control.getConnection(system.getMysql_admin(),system.getMysql_pass());

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
            JBDC_Control.close(rs,statement,connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userList;
    }

    /**
     * 通过电话号码在数据库中查找用户
     *
     * @param phone 电话
     * @return {@link User} 若未查询到则返回null
     */
    public static User querryUserbyPhone(String phone) {
        List<User> userList =  readUserData();
        for (User user:userList){
            if (user.getPhone().equals(phone)){
                return user;
            }
        }
        return null;
    }

    public static boolean addUserData(String user,String pass,String phone){
        Connection connection = JBDC_Control.getConnection(system.getMysql_admin(),system.getMysql_pass());
        Statement  statement = null;
        try {
            statement = connection.createStatement();
            String sql = "INSERT INTO user VALUES ();";
            ResultSet rs = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

}
