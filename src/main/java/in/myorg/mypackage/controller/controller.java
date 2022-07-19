package in.myorg.mypackage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;

import java.util.Date;

@RestController
public class controller {
    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to Spring Boot!!";

    }
    @GetMapping("/getDate")
    public Date getDate(){
        return new Date();
    }

    }

