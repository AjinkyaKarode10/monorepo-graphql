package com.dailycodebuffer.graphqldemo.author.repository;

import com.dailycodebuffer.graphqldemo.author.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface  AuthorRepository extends MongoRepository<Author, String> {
    Optional<Author> findByAuthorId(String aId);
}
