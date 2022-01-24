package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new User("Michal", new FacebookPublisher());
        User user2 = new User("Agata", new SnapchatPublisher());
        User user3 = new User("Stefan", new TwitterPublisher());

        //When
        String facebook = user1.socialPublisher.share();
        String snapchat = user2.socialPublisher.share();
        String twitter = user3.socialPublisher.share();

        //Then
        assertEquals("Facebook", facebook);
        assertEquals("Snapchat", snapchat);
        assertEquals("Twitter", twitter);
    }

    @Test
    void testIndividualSharingStrategies() {
        //Given
        User user4 = new User("Zdzicho", new TwitterPublisher());

        //When
        String social = user4.socialPublisher.share();
        System.out.println("Social publisher: " + social);
        user4.setSocialPublisher(new FacebookPublisher());
        social = user4.socialPublisher.share();
        System.out.println("Social publisher: " + social);

        //Then
        assertEquals("Facebook", social);
    }
}
