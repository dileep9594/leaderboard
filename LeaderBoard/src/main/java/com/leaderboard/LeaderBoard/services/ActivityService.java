package com.leaderboard.LeaderBoard.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.leaderboard.LeaderBoard.models.User;
import com.leaderboard.LeaderBoard.models.UserActivity;
import com.leaderboard.LeaderBoard.repositories.UserActivityRepository;
import com.leaderboard.LeaderBoard.repositories.UserRepo;

public class ActivityService {
    @Autowired
    private UserActivityRepository useractivityrepo;
    private UserActivity useractivity ;
    private UserRepo userrepo;

    public void handleLoginActivity(String userId) {
        // Retrieve user from database
        User user = userrepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        
        // Logic to handle login activity
        // Add 10 points to the user's score for logging in
        int newScore = useractivity.getScore() + 10;
        useractivity.setScore(newScore);  
        // Update user's score in the database
        useractivityrepo.save(user);
    }

    // Similar methods for other activity types
}
