package com.vistly.vistlyApp.service;

import com.vistly.vistlyApp.entity.UserEntity;
import com.vistly.vistlyApp.model.User;
import com.vistly.vistlyApp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();

        return userEntities
                .stream()
                .map((UserEntity userEntity) -> new User(
                        userEntity.getId(),
                        userEntity.getFirstName(),
                        userEntity.getLastName(),
                        userEntity.getEmailId()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public User getUserById(Long id) {
        UserEntity userEntity = userRepository.findById(id).get();
        User user = new User();
        BeanUtils.copyProperties(userEntity, user);
        return user;
    }

}


