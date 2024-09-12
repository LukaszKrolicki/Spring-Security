package com.app.springsec.controller;

import com.app.springsec.model.Users;
import com.app.springsec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users  registerUser(@RequestBody Users user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return userService.verify(user);
    }
}
