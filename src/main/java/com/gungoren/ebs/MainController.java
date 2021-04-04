package com.gungoren.ebs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/welcome")
    public String welcomePage(){
        return "Welcome to my web app!. This is new version of app";
    }
}
