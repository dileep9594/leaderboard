package com.leaderboard.LeaderBoard.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leaderboard.LeaderBoard.models.Activity;

public interface ActivityRepository extends MongoRepository<Activity, String> {
}