package org.msp.securityservice.service;

import msp.core.service.GenericService;
import org.msp.securityservice.model.User;
import org.msp.securityservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericService<User,Long> {

    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
    }
}
