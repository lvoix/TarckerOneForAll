package com.goldenway.rest;


import com.goldenway.dto.UserInfoDTO;
import com.goldenway.entities.user;
import com.goldenway.services.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping
    public List<user> getAllusers() {
        return userService.getAllUsers();
    }


}
