package ru.didcvee.photoappapiusers.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import ru.didcvee.photoappapiusers.model.CreateUserRequestModel;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private Environment environment;
    @GetMapping("/aloha")
    public String sayHello(){
        return "Hello from user microservice "+environment.getProperty("local.server.port");
    }
    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel userDetails){
        return "Create user";
    }
}
