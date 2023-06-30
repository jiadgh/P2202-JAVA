package fun;
import classlib.*;
public class JBDC_User {
    /**
     * 增加用户
     *
     * @param user  用户名
     * @param phone 电话号码
     * @return boolean T增加成功，F增加失败
     */
    public static boolean adduser(String user,String phone,String pass){
        new JBDC_Control().getConnection("root","123456");

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
       User user = new User("user","12345678911","111111111");

       return user;
    }

    public static void main(String[] args) {
        JBDC_User jbdcUser= new JBDC_User();
        jbdcUser.adduser("张三","19858681320","Aa123456");
    }
}
