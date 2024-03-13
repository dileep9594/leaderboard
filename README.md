# leaderboard
In this project i am going to build a project using java spring boot and mongodb which will calculate the leader board based on the user activity 

# Objective:
1. Build a leaderboard system that tracks user activities in a game and calculates scores based on those activities.
2. Users should be able to view their own scores as well as the top scores on the leaderboard.
# Functional Requirements:
1. Users can register/login to the system.
2. Users can perform various activities in the game, such as completing levels, earning achievements, etc.
3. Each activity has a predefined score associated with it.
4. The system calculates scores for users based on their activities.
5. Users can view their own scores and rankings on the leaderboard.
6. Users can view the top scores and rankings on the leaderboard.
# Non-functional Requirements:
1. The system should be scalable to handle a large number of users and activities.
2. The system should be secure to protect user data and prevent unauthorized access.
3. The system should be efficient in calculating scores and updating the leaderboard.
# Assumptions:
We'll assume a simplified scenario where users have unique IDs and activities are limited to a few types (e.g., completing levels, earning achievements).

Database Schema Design:
1. Users Table:
Stores information about registered users.
Column Name	Data Type	Description
user_id	    INTEGER	    Primary Key
username	VARCHAR	    Unique username
password	VARCHAR	    Hashed password
email	    VARCHAR	    Email address
created_at	TIMESTAMP	Creation timestamp
2. Activities Table:
Stores information about different activities that users can perform in the game.
Column Name	    Data Type	    Description
activity_id	    INTEGER	        Primary Key
activity_name	VARCHAR	        Name of the activity
score	        INTEGER	        Score associated with activity
3. UserActivities Table:
Stores the relationship between users and their performed activities.
Column Name 	    Data Type	    Description
user_activity_id	INTEGER	        Primary Key
user_id	            INTEGER	        Foreign Key: Users(user_id)
activity_id	        INTEGER	        Foreign Key: Activities(activity_id)
timestamp	        TIMESTAMP	    Timestamp of activity performed
4. Leaderboard Table:
Stores the current leaderboard rankings.
Column Name	    Data Type	    Description
leaderboard_id	INTEGER	        Primary Key
user_id	        INTEGER	        Foreign Key: Users(user_id)
score	        INTEGER	        User's score
rank	        INTEGER	        User's rank on the leaderboard