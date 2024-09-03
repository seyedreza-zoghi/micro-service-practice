package org.msp.securityservice.controller;


import msp.core.controller.GenericController;
import msp.core.service.GenericService;
import org.msp.securityservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController extends GenericController<User,Long> {

    protected UserController(GenericService<User, Long> service) {
        super(service);
    }

    @GetMapping("/test")
    public List<User> test() {
        return null;
    }
}
