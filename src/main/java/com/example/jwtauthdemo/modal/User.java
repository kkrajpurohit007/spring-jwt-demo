package com.example.jwtauthdemo.modal;

import lombok.*;

@Data
@ToString
public class User {
    private String id;
    private String username;
    private String password;
    private boolean isActive;

    public User(String id, String username, String password, boolean isActive) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
    }
}
