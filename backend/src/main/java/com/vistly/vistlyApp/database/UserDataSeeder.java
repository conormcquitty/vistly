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
    private static final String PROFILE_IMAGE_BASE_URL = "https://res.cloudinary.com/glide/image/fetch/f_auto,w_500,c_limit/https%3A%2F%2Fres.cloudinary.com%2Fglide%2Fimage%2Fupload%2Fonboarding_img%2F";

    public UserDataSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public CommandLineRunner seedUsers() {
        return args -> {
            // Only seed if no users exist
            if (userRepository.count() == 0) {
                List<UserEntity> users = List.of(
                        createUser("Ava", "Wilder", "ava_wilder@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e36-7ff3-a47e-f5caad3eae39",
                                "Vancouver", "BC", "Canada"),

                        createUser("Cameron", "Lee", "cameron_lee@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e44-7ff3-a47f-1cbee82febdb",
                                "Toronto", "ON", "Canada"),

                        createUser("Ethan", "Bishop", "ethan_bishop@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e35-7ff3-a47e-ea1cc3c16931",
                                "Seattle", "WA", "United States"),

                        createUser("Ethan", "Kim", "ethan_kim@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e32-7ff3-a47e-da143a3a741f",
                                "Whistler", "BC", "Canada"),

                        createUser("Giovanni", "Mendez", "giovanni_mendez@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e39-7ff3-a47f-0749f663da66",
                                "Los Angeles", "CA", "United States"),

                        createUser("Luna", "Rodriguez", "luna_rodriguez@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e30-7ff3-a47e-d1b6053b7b4c",
                                "Calgary", "AB", "Canada"),

                        createUser("Martha", "Lomax", "martha_lomax@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e38-7ff3-a47e-f8cc54aa7f0a",
                                "Toronto", "ON", "Canada"),

                        createUser("Mateo", "Rios", "mateo_rios@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e38-7ff3-a47e-f8cc54aa7f0a",
                                "Toronto", "ON", "Canada"),

                        createUser("Olivia", "Rodriguez", "olivia_rodriguez@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e2d-7ff3-a47e-c28e33aacc73",
                                "Boston", "MA", "United States"),

                        createUser("Rebecca", "Vasquez", "rebecca_vasquez@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e32-7ff3-a47e-e09981b1103a",
                                "San Francisco", "CA", "United States"),

                        createUser("Ronald", "Chen", "ronald_chen@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e2f-7ff3-a47e-c96cc87533d3",
                                "Manhattan", "NYC", "United States"),

                        createUser("Sofia", "Patel", "sofia_patel@example.com",
                                PROFILE_IMAGE_BASE_URL + "0195b5f4-7e42-7ff3-a47f-118b4b4b650b",
                                "Paramus", "NJ", "United States")
                );

                // not seeding for now
//                userRepository.saveAll(users);
            }
        };
    }

    private UserEntity createUser(
            String firstName,
            String lastName,
            String email,
            String profileImageUrl,
            String locality,
            String administrativeArea,
            String country
    ) {

        return UserEntity.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .profileImageUrl(profileImageUrl)
                .locality(locality)
                .administrativeArea(administrativeArea)
                .country(country)
                .build();
    }
}