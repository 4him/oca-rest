package com.tekwill.oca.myrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service(value = "user")
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        List<User> users = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            users.add(new User(i,"User" + String.valueOf(i),
                    "Surname",
                    new Random().nextInt(10) + 20));
        }

        User user = users.stream()
                .filter(u -> u.getId().equals(id))
                .findAny().orElse(new User());


        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            users.add(new User(i,"User" + String.valueOf(i),
                    "Surname",
                    new Random().nextInt(10) + 20));
        }

        return users;
    }

    @Override
    public void deleteById(Integer id) {
        System.out.println("User was deleted");
    }

    @Override
    public void updateUserById(Integer id) {

    }
}
