package com.leaderboard.LeaderBoard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leaderboard.LeaderBoard.services.ActivityService;

public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping("/activity/login")
    public ResponseEntity<String> handleLoginActivity(@RequestParam String userId) {
        activityService.handleLoginActivity(userId);
        return ResponseEntity.ok("Login activity recorded successfully!");
    }

    // Similar methods for other activity endpoints@Autowired
    
}
