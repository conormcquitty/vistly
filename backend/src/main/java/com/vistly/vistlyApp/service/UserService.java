package com.vistly.vistlyApp.service;

import com.vistly.vistlyApp.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();

    UserEntity getUserById(Long id);
}
