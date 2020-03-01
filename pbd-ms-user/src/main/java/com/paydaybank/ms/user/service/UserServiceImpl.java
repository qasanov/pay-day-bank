package com.paydaybank.ms.user.service;

import com.paydaybank.ms.user.domain.User;
import com.paydaybank.ms.user.exceptions.ExisitingEmailException;
import com.paydaybank.ms.user.exceptions.WeakPasswordException;
import com.paydaybank.ms.user.repository.UserRepository;
import com.paydaybank.ms.user.util.PasswordUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private PasswordEncoder bcryptEncoder;


    public UserServiceImpl(UserRepository userRepository, PasswordEncoder bcryptEncoder) {
        this.userRepository = userRepository;
        this.bcryptEncoder = bcryptEncoder;
    }

    @Override
    public User create(User user) {
        validate(user);
        user.setPassword( bcryptEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    private void validate(User user){
        Optional<User> optionalUser = userRepository.findByEmailAddress(user.getEmailAddress());

        if(optionalUser.isPresent())
            throw new ExisitingEmailException("Provided email address already exists!");

        if(user.getPassword() == null || !PasswordUtil.isAlphanumeric(user.getPassword()))
            throw new WeakPasswordException("Password should be at least minimum 6 char length and alphanumeric!");
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
