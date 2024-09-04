package com.dailycodebuffer.graphqldemo.author.command_query;

import com.dailycodebuffer.graphqldemo.author.command_query.AuthorCommand;
import com.dailycodebuffer.graphqldemo.author.model.Author;
import com.dailycodebuffer.graphqldemo.author.resolver.AuthorMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class AuthorCommandImpl implements AuthorCommand {

    private final AuthorMutationResolver authorMutationResolver;

    public AuthorCommandImpl(AuthorMutationResolver authorMutationResolver) {
        this.authorMutationResolver = authorMutationResolver;
    }

    public Author createAuthor( String firstName, String lastName) {
        Author author = new Author(firstName,lastName);
        return authorMutationResolver.create(author);
    }

}
