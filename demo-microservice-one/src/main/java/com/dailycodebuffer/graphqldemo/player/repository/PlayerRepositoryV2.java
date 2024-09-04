package com.dailycodebuffer.graphqldemo.player.repository;

import com.dailycodebuffer.graphqldemo.player.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PlayerRepositoryV2 {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Player savePlayer(Player player) {
        return mongoTemplate.save(player);
    }

    public long count() {
        return mongoTemplate.count(new Query(),Player.class);
    }
    public Optional<Player> findByPlayerId(String playerId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("lastName").is(playerId));
        return Optional.of(mongoTemplate.findOne(query, Player.class));
    }
}
