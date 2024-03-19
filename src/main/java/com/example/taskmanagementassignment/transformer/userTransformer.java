package com.example.taskmanagementassignment.transformer;

import com.example.taskmanagementassignment.dto.request.UserRequest;
import com.example.taskmanagementassignment.model.User;

public class userTransformer {

    public static User UserRequestToUser(UserRequest userRequest) {
        return User.builder()
                .userName(userRequest.getUserName())
                .mobileNo(userRequest.getMobileNo())
                .build();
    }
}
