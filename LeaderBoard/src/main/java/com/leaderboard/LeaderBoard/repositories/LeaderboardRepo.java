package com.leaderboard.LeaderBoard.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leaderboard.LeaderBoard.models.Leaderboard;

public interface LeaderboardRepo extends MongoRepository<Leaderboard, String> {
}
