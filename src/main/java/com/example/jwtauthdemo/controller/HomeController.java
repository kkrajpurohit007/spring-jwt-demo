package com.example.jwtauthdemo.controller;

import com.example.jwtauthdemo.modal.User;
import com.example.jwtauthdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    private final UserService userService;

    @Autowired
    HomeController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/test")
    public String test(){
        return "Testing End Point";
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }

}
