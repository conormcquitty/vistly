package com.vistly.vistlyApp.model;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;

}