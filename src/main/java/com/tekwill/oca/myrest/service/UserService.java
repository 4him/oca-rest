package com.tekwill.oca.myrest.service;

import com.tekwill.oca.myrest.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Integer id);
    List<User> getAllUsers();
    void deleteById(Integer id);

    void updateUserById(Integer id);
}
