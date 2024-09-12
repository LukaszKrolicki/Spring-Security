package com.app.springsec;

import com.app.springsec.model.Users;
import com.app.springsec.repo.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringSecApplication.class, args);
    }

}
