package com.example.jwtauthdemo.services;

import com.example.jwtauthdemo.modal.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public UserService() {
        this.users.add(new User("1","kamal","123456",true));
        this.users.add(new User("2","kishore","123456",true));
        this.users.add(new User("3","singh","123456",true));
    }

    public List<User> getUsers(){
        return users;
    }


}
