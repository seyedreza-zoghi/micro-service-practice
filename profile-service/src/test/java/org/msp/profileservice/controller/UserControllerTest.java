package org.msp.profileservice.controller;

import org.junit.jupiter.api.Test;
import org.msp.profileservice.dto.UserDto;
import org.msp.profileservice.repository.ProfileRepository;
import org.msp.profileservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserControllerTest {

    @Autowired
    UserService userService;

    @Autowired
    ProfileRepository repository;
    @Test
    void save() {
        UserDto userDto = new UserDto();
        userService.createUser(userDto);
        repository.findAll();
    }
}