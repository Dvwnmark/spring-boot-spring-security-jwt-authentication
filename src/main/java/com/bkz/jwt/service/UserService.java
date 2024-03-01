package com.bkz.jwt.service;

import com.bkz.jwt.authen.UserPrincipal;
import com.bkz.jwt.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
