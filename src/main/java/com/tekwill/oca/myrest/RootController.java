package com.tekwill.oca.myrest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/users")
public class RootController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getName() {

        return "JORA";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser() {
        User user = new User();
        user.setName("Jora");
        user.setSurname("Vartan");
        user.setAge(40);

        return user;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            users.add(new User(i,"User" + String.valueOf(i),
                    "Surname",
                    new Random().nextInt(10) + 20));
        }

        return users;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Integer id) {

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


}

