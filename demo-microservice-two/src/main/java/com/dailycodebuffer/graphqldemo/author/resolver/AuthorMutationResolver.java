package com.dailycodebuffer.graphqldemo.author.resolver;

import com.dailycodebuffer.graphqldemo.author.model.Author;
import com.dailycodebuffer.graphqldemo.author.repository.AuthorRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutationResolver {

    AuthorRepository authorRepository;

    public AuthorMutationResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author create(Author author) {
        authorRepository.save(author);
        return author;
    }

//    public Player update(Player player) {
//        Player updatedPlayerRecord;
//        Optional<Player> optional = playerRepository.findByPlayerId(player.getPlayerId());
//
//        if (optional.isPresent()) {
//            Player existingPlayer = optional.get();
//            existingPlayer.setName(player.getName());
//            existingPlayer.setTeam(player.getTeam());
//            updatedPlayerRecord = playerRepository.save(existingPlayer);
//        } else {
//            throw new IllegalArgumentException("Invalid Player");
//        }
//        return updatedPlayerRecord;
//    }

    @PostConstruct
    private void init() {
        if (authorRepository.count() == 0) {
            authorRepository.save((new Author( "Mahatma M. K. ", "Gandhi")));
        }
    }

}
