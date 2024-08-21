package org.msp.profileservice.service;

import org.msp.profileservice.dto.UserDto;
import org.msp.profileservice.mapper.UserMapper;
import org.msp.profileservice.model.User;
import org.msp.profileservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public User createUser(UserDto userDto) {
        return userRepository.save(userMapper.toEntity(userDto));
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long id, User userDetails) {
//        User existingUser = userRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("User not found with id " + id));
//
//        existingUser.setUsername(userDetails.getUsername());
//        existingUser.setEmail(userDetails.getEmail());
//        existingUser.setPassword(userDetails.getPassword());  // Consider hashing the password
//        existingUser.setIsActive(userDetails.getIsActive());
//
//        return userRepository.save(existingUser);
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));

        userRepository.delete(user);
    }
}
