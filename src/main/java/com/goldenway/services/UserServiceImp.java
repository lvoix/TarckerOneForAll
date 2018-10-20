package com.goldenway.services;

import com.goldenway.dto.UserInfoDTO;
import com.goldenway.repository.UserRepository;
import com.goldenway.services.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserInfoDTO> getAllUsers() {

        return userRepository.findAll();
    }
}
