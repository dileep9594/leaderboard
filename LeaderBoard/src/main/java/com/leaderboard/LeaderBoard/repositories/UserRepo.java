package com.leaderboard.LeaderBoard.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leaderboard.LeaderBoard.models.User;

public interface UserRepo extends MongoRepository<User, String> {
    User findByUsername(String username);
}
