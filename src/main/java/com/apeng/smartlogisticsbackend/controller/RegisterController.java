package com.apeng.smartlogisticsbackend.controller;

import com.apeng.smartlogisticsbackend.dto.RegisterRequest;
import com.apeng.smartlogisticsbackend.entity.User;
import com.apeng.smartlogisticsbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String register(@RequestBody RegisterRequest registerRequest) {
        return userService.register(registerRequest);
    }

}
