package com.example.taskmanagementassignment.controller;


import com.example.taskmanagementassignment.dto.request.UserRequest;
import com.example.taskmanagementassignment.dto.response.UserResponse;
import com.example.taskmanagementassignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity addUser(@RequestBody UserRequest userRequest){
        UserResponse userResponse = UserService.addUser(userRequest);
        return new ResponseEntity(userResponse, HttpStatus.CREATED);
    }
}
