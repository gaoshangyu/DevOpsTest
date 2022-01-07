package org.example.Function;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class Login {
    @GetMapping(value = "/login")  //http://127.0.0.1:8005/user/login
    public String login(){
        System.out.println("login success!");
        return "login seccess";
    }
}
