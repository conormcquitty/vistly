package com.vistly.vistlyApp.database;

import com.vistly.vistlyApp.entity.UserEntity;
import com.vistly.vistlyApp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserDataSeeder {

    private final UserRepository userRepository;

    public UserDataSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public CommandLineRunner seedUsers() {
        return args -> {
            // Only seed if no users exist
            if (userRepository.count() == 0) {
                List<UserEntity> users = List.of(
                        createUser("John", "Doe", "john.doe@example.com"),
                        createUser("Jane", "Smith", "jane.smith@example.com"),
                        createUser("Mike", "Johnson", "mike.johnson@example.com")
                );

                userRepository.saveAll(users);
            }
        };
    }

    private UserEntity createUser(String firstName, String lastName, String emailId) {

        return UserEntity.builder()
                .firstName(firstName)
                .lastName(lastName)
                .emailId(emailId)
                .build();
    }
}