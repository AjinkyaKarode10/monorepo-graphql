package com.dailycodebuffer.graphqldemo.author.model;

import org.springframework.data.annotation.Id;

public class Author {

    @Id
    private String authorId;

    private String firstName;

    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
