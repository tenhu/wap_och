package mum.controller;

import mum.model.UserModel;

public class UserController {
    UserModel user;

    public UserController(){
        user = new UserModel();
    }

    public boolean checkUser(String name, String pass ) {
        if(name.equals(user.getUserName()) && pass.equals(user.getUserPassword())  ) {
            return true;
        }
        return false;
    }
}