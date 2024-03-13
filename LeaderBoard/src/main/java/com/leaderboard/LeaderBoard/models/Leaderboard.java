package com.leaderboard.LeaderBoard.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "leaderboard")
public class Leaderboard {
    @Id
    private String id;
    private String userId;
    private int score;
    private int rank;
    // Getters and setters
}
