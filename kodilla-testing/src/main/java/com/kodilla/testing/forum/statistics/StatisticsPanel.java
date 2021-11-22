package com.kodilla.testing.forum.statistics;

public class StatisticsPanel {
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

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.userNames().size();
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        avgPostCountPreUser = postCount / userCount;
        avgCommentsCountPreUser = commentsCount / userCount;
        avgCommentsCountPrePost = commentsCount / postCount;
    }

    public void showStatistics() {
        System.out.println("User count: " + userCount);
        System.out.println("Posts count: " + postCount);
        System.out.println("Comments count: " + commentsCount);
        System.out.println("Average post count pre user: " + avgPostCountPreUser);
        System.out.println("Average comments count per user: " + avgCommentsCountPreUser);
        System.out.println("Average comments count per post: " + avgCommentsCountPrePost);
    }
}
