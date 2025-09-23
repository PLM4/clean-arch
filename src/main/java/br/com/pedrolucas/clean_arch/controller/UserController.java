package br.com.pedrolucas.clean_arch.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.pedrolucas.clean_arch.model.User;
import br.com.pedrolucas.clean_arch.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController{
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
}
