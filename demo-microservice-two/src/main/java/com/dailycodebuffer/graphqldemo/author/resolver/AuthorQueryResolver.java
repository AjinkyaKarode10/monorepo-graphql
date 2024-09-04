package com.dailycodebuffer.graphqldemo.author.resolver;

import com.dailycodebuffer.graphqldemo.author.model.Author;
import com.dailycodebuffer.graphqldemo.author.repository.AuthorRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AuthorQueryResolver {

    AuthorRepository authorRepository;
    public AuthorQueryResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Author findOne(String pId) {
        Optional<Author> playerOp = authorRepository.findByAuthorId(pId);
        return playerOp.orElse(null);
    }
}
