package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsPanel {
    private List<String> userNames;
    private int userCount;
    private int postCount;
    private int commentsCount;
    private double avgPostCountPerUser;
    private double avgCommentsCountPerUser;
    private double avgCommentsCountPerPost;
    private Statistics statistics;

    public StatisticsPanel(Statistics statistics) {
        this.statistics = statistics;
    }

    public List<String> userNames() {
        List<String> userNamesList = new ArrayList<String>();
        userNamesList = statistics.userNames();
        return userNamesList;
    }

    public int postCount() {
        return statistics.postsCount();
    }

    public int commentsCount() {
        return statistics.commentsCount();
    }

    public double getAvgPostCountPerUser() {
        return avgPostCountPerUser;
    }

    public double getAvgCommentsCountPerUser() {
        return avgCommentsCountPerUser;
    }

    public double getAvgCommentsCountPerPost() {
        return avgCommentsCountPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.userNames().size();
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (userCount == 0 || postCount == 0) {
            avgPostCountPerUser = 0;
            avgCommentsCountPerUser = 0;
            avgCommentsCountPerPost = 0;
        } else {
            avgPostCountPerUser = (double)postCount / userCount;
            avgCommentsCountPerUser = (double)commentsCount / userCount;
            avgCommentsCountPerPost = (double) commentsCount / postCount;
        }
    }

    public void showStatistics() {
        System.out.println("User count: " + userCount);
        System.out.println("Posts count: " + postCount);
        System.out.println("Comments count: " + commentsCount);
        System.out.println("Average post count per user: " + avgPostCountPerUser);
        System.out.println("Average comments count per user: " + avgCommentsCountPerUser);
        System.out.println("Average comments count per post: " + avgCommentsCountPerPost);
    }
}
