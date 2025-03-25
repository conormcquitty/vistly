package com.vistly.vistlyApp.model;

import lombok.Data;

@Data
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;

    public User(long id, String firstName, String lastName, String emailId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public User() {
    }
}
