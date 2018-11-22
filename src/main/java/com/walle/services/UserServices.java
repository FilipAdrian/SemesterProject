package com.walle.services;

import com.walle.entities.User;
import com.walle.repository.UserRepository;

import java.util.List;

public class UserServices {
    private UserRepository  userRepository;

    public UserServices (){
        this.userRepository = new UserRepository ();
    }

    public List<User> getAllUser() throws Exception{
        return  userRepository.getAll ();
    }

    public User checkLoginAndPassword(String login,String password) throws Exception{
        return userRepository.checkLoginPassword (login,password);
    }

}
