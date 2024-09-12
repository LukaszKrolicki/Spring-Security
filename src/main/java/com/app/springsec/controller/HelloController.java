package com.app.springsec.controller;

import com.app.springsec.model.Users;
import com.app.springsec.repo.UserRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello, World!" + request.getSession().getId();
    }
}
