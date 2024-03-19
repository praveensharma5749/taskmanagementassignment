package com.example.taskmanagementassignment.service;

import com.example.taskmanagementassignment.dto.request.UserRequest;
import com.example.taskmanagementassignment.dto.response.UserResponse;
import com.example.taskmanagementassignment.model.User;
import com.example.taskmanagementassignment.repository.UserRepository;
import com.example.taskmanagementassignment.transformer.userTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    static
    UserRepository userRepository;
    public static UserResponse addUser(UserRequest userRequest) {
        User user= userTransformer.UserRequestToUser(userRequest);
        User savedUser=userRepository.save(user);
        return userTransformer.User
    }
}
