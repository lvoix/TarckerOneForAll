package com.goldenway.services;

import com.goldenway.entities.user;
import com.goldenway.repository.UserRepository;
import com.goldenway.services.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public user create(user user) {
        return userRepository.save(user);
    }

    @Override
    public List<user> getAllUsers() {

        return userRepository.findAll();
    }

}
