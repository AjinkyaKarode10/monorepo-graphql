package com.dailycodebuffer.graphqldemo.author.command_query;


import com.dailycodebuffer.graphqldemo.author.model.Author;
import com.dailycodebuffer.graphqldemo.author.resolver.AuthorQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorQueryImpl implements AuthorQuery {

    private final AuthorQueryResolver authorQueryResolver;

    public AuthorQueryImpl(AuthorQueryResolver authorQueryResolver) {
        this.authorQueryResolver = authorQueryResolver;
    }

    public List<Author> findAll() {
        return authorQueryResolver.findAll();
    }

    public Author findByPlayerId(String playerId) {
        return authorQueryResolver.findOne(playerId);
    }
}
