package org.msp.securityservice.controller;


import msp.core.controller.GenericController;
import msp.core.service.GenericService;
import org.msp.securityservice.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController extends GenericController<User,Long> {

    protected UserController(GenericService<User, Long> service) {
        super(service);
    }

    @Override
    @PostMapping("/save")
    public User create(@RequestBody User entity) {
        return super.create(entity);
    }

    @Override
    @GetMapping("/getAll")
    public List<User> getAll() {
        return super.getAll();
    }
}
