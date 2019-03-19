package mum.model;

public class UserModel {

    String userName;
    String userPassword;
    String phoneNo;
    String email;

    public UserModel(){
        userName = "wap";
        userPassword = "123";
        phoneNo = "8001001222";
        email = "wap@mum.edu";
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }
}
