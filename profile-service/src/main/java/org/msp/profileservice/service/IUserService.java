package org.msp.profileservice.service;

import org.msp.profileservice.dto.UserDto;
import org.msp.profileservice.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User createUser(UserDto user);

    Optional<User> getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(Long id, User userDetails);

    void deleteUser(Long id);
}
