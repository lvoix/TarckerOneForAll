package com.goldenway.services.Interface;

import com.goldenway.entities.user;

import java.util.List;

public interface UserService {
    public user create(user user);
    public List<user> getAllUsers();
}
