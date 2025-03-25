package com.vistly.vistlyApp.service;

import com.vistly.vistlyApp.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);
}
