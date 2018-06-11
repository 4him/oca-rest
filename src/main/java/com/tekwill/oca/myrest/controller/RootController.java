package com.tekwill.oca.myrest.controller;

import com.tekwill.oca.myrest.model.User;
import com.tekwill.oca.myrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/users")
public class RootController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        user.setId(new Random().nextInt(1_000_000));
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public User updateUserById(@PathVariable("id") Integer id, @RequestBody User user) {
        System.out.println(user);
        System.out.println("id = " + id);

        return user;
    }

}

