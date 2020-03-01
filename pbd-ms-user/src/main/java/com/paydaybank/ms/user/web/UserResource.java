package com.paydaybank.ms.user.web;


import com.paydaybank.ms.user.domain.User;
import com.paydaybank.ms.user.repository.UserRepository;
import com.paydaybank.ms.user.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserResource {

   private UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody User user){
        userService.create(user);
        return ResponseEntity.ok().build();
    }
}
