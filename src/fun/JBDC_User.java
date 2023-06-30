package fun;
import classlib.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JBDC_User {
    /**
     * 增加用户
     *
     * @param user  用户名
     * @param phone 电话号码
     * @return boolean T增加成功，F增加失败
     */
    public static boolean adduser(String user,String phone,String pass){
        new JBDC_Control().getConnection(system.getMysql_admin(),system.getMysql_pass());
        String sql = "";
        return true;
    }

    /**
     * 通过ID删除用户
     *
     * @param id 用户ID
     * @return boolean
     */
    public static boolean deleteUserbyID(int id){

        return true;
    }
    public static boolean deleteUserbyPhone(String Phone){
        return true;
    }
    public static User querryUserbyPhone(String phone){



        return new User();
    }
    public static List queryStudent() {
         List<User> userList = new ArrayList<>();
         Connection connection = JBDC_Control.getConnection("root","123456");

        try {
            Statement  statement = connection.createStatement();
            String sql = "SELECT * FROM user";
            ResultSet rs = statement.executeQuery(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userList;
    }

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList = queryStudent();
        for (User user : userList){
            System.out.println(user);
        }
    }
}
