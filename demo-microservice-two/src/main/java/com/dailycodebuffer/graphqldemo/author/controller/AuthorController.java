package com.dailycodebuffer.graphqldemo.author.controller;


import com.dailycodebuffer.graphqldemo.author.command_query.AuthorCommand;
import com.dailycodebuffer.graphqldemo.author.command_query.AuthorQuery;
import com.dailycodebuffer.graphqldemo.author.model.Author;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class AuthorController {

    private final AuthorQuery authorQuery;

    public AuthorController(AuthorQuery authorQuery) {
        this.authorQuery = authorQuery;
    }

    @QueryMapping
    public Flux<Author> findAll() {
        return Flux.fromIterable(authorQuery.findAll());
    }

}
