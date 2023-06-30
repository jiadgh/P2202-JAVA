package classlib;

import java.util.Date;

public class User {
    int id;
    String user;
    String pass;
    String phone;
    String avatar;
    int borrownum;
    int booklistnum;
    String A1;
    String A2;
    Date A3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getBorrownum() {
        return borrownum;
    }

    public void setBorrownum(int borrownum) {
        this.borrownum = borrownum;
    }

    public int getBooklistnum() {
        return booklistnum;
    }

    public void setBooklistnum(int booklistnum) {
        this.booklistnum = booklistnum;
    }

    public String getA1() {
        return A1;
    }

    public void setA1(String a1) {
        A1 = a1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String a2) {
        A2 = a2;
    }

    public Date getA3() {
        return A3;
    }

    public void setA3(Date a3) {
        A3 = a3;
    }
    public User(){

    }
    public User(String user, String pass,String phone) {
        this.user = user;
        this.pass = pass;
        this.phone = phone;
    }

    public User(String user, String pass, String phone, String avatar, String a1, String a2, Date a3) {
        this.user = user;
        this.pass = pass;
        this.phone = phone;
        this.avatar = avatar;
        A1 = a1;
        A2 = a2;
        A3 = a3;
    }
}
