package com.leaderboard.LeaderBoard.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "activities")
public class Activity {
     @Id
    private String id;
    private String name;
    private int score;
    // Getters and setters
    
}
