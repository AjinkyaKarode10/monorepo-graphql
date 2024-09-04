package com.dailycodebuffer.graphqldemo.author.command_query;

import com.dailycodebuffer.graphqldemo.author.model.Author;


public interface AuthorCommand {
    public Author createAuthor(String firstName, String lastName);
}
