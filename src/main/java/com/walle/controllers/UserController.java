package com.walle.controllers;

import com.walle.entities.User;
import com.walle.services.ProductService;
import com.walle.services.UserServices;

import java.util.List;

public class UserController {
UserServices userServices;

    public UserController(){
        this.userServices = new UserServices ();
    }

    public List<User> displayUsers() throws Exception{
        return  userServices.getAllUser ();
    }

    public User verifyUser(String login,String password) throws Exception{
        return userServices.checkLoginAndPassword (login,password);
    }
}
