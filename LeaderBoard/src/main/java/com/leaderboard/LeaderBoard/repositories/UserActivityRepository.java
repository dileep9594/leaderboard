package com.leaderboard.LeaderBoard.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leaderboard.LeaderBoard.models.User;
import com.leaderboard.LeaderBoard.models.UserActivity;

public interface UserActivityRepository extends MongoRepository<UserActivity, String> {
    void save(User user);
}