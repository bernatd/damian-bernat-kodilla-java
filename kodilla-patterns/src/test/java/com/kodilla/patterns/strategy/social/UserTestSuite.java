package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Michal"); //Facebook
        User user2 = new ZGeneration("Agata"); //Snapchat
        User user3 = new YGeneration("Stefan"); //Twitter

        //When
        String facebook = user1.sharePost().share();
        String snapchat = user2.sharePost().share();
        String twitter = user3.sharePost().share();

        //Then
        assertEquals("Facebook", facebook);
        assertEquals("Snapchat", snapchat);
        assertEquals("Twitter", twitter);
    }

    @Test
    void testIndividualSharingStrategies() {
        //Given
        User user4 = new YGeneration("Zdzicho");

        //When
        String social = user4.sharePost().share();
        System.out.println("Social publisher: " + social);
        user4.setSocialPublisher(new FacebookPublisher());
        social = user4.sharePost().share();
        System.out.println("Social publisher: " + social);

        //Then
        assertEquals("Facebook", social);
    }
}
