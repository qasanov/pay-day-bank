package com.paydaybank.ms.user.web;


import com.paydaybank.ms.user.domain.User;
import com.paydaybank.ms.user.repository.UserRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @Autowired
    private PasswordEncoder bcryptEncoder;

    private final UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/list")
    public List<User> getUserList(){
        return userRepository.findAll();
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){

        user.setPassword( bcryptEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

}
