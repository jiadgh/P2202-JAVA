package fun;
import fun.*;
public class RegisterFUN {
    public static String Register(String user,String pass1,String pass2,String phone){
        if (user==""||pass1==""||pass2==""||phone==""){
            return "输入不能为空";
        }
        if (phone.length()!=11){
            return "手机号输入错误";
        }
        if (JBDC_User.querryUserbyPhone(phone)==null){
            return "该用户已注册";
        }
        if (pass1.equals(pass2)==false){
            return "两次输入的密码不相同";
        }
        if (pass1.length()<8){
            return "密码不能小于8位";
        }
        return "";
    }
}
