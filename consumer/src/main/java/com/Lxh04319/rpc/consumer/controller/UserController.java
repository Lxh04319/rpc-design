package com.Lxh04319.rpc.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class UserController {
    @RpcReference
    private UserService userService;


    @RequestMapping("/user/getUser")
    public User getUser() {
        return userService.queryUser();
    }

    @RequestMapping("/user/getAllUser")
    public List<User> getAllUser() {

        return userService.getAllUsers();
    }
}
