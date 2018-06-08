package com.tekwill.oca.myrest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "student")
public class StudentServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void updateUserById(Integer id) {

    }
}
