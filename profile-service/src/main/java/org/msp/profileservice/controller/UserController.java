package org.msp.profileservice.controller;

import org.msp.profileservice.dto.UserDto;
import org.msp.profileservice.model.User;
import org.msp.profileservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    IUserService iUserService;
    @PostMapping("/save")
    public User save(UserDto userDto) {
        return iUserService.createUser(userDto);
    }
}
