package com.paydaybank.ms.user.service;

import com.paydaybank.ms.user.domain.User;

import java.util.List;

public interface UserService {

    User create(User user);
    List<User> getUserList();

}
