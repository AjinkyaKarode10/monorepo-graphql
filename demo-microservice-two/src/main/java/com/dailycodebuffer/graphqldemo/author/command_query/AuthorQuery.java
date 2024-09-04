package com.dailycodebuffer.graphqldemo.author.command_query;

import com.dailycodebuffer.graphqldemo.author.model.Author;

import java.util.List;

public interface AuthorQuery {

    public List<Author> findAll();
    public Author findByPlayerId(String playerId);
}
