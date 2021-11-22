package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsPanel {
    private List<String> userNames;
    private int userCount;
    private int postCount;
    private int commentsCount;
    private int avgPostCountPreUser;
    private int avgCommentsCountPreUser;
    private int avgCommentsCountPrePost;
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

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.userNames().size();
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (userCount == 0) {
            avgPostCountPreUser = 0;
            avgCommentsCountPreUser = 0;
        } else {
            avgPostCountPreUser = postCount / userCount;
            avgCommentsCountPreUser = commentsCount / userCount;
        }
        if (postCount == 0) {
            avgCommentsCountPrePost = 0;
        } else {
            avgCommentsCountPrePost = commentsCount / postCount;
        }

    }

    public void showStatistics() {
        System.out.println("User count: " + userCount);
        System.out.println("Posts count: " + postCount);
        System.out.println("Comments count: " + commentsCount);
        System.out.println("Average post count per user: " + avgPostCountPreUser);
        System.out.println("Average comments count per user: " + avgCommentsCountPreUser);
        System.out.println("Average comments count per post: " + avgCommentsCountPrePost);
    }
}
