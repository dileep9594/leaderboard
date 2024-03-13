package com.leaderboard.LeaderBoard.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Document(collection = "user_activities")
public class UserActivity {
     @Id
    private String id;
    @DBRef
    private String userId;
    @DBRef
    private String activityId;
    private Integer score ;
    private LocalDateTime timestamp;
    // Getters and setters
}
