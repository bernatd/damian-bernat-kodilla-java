package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsPanelTestSuite {
    private static int testCounter = 0;

    @Mock
    private Statistics statisticsMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsWith0Posts() {
        //Given
        int resultPostCountEq0 = 0;
        StatisticsPanel statisticsPanel = new StatisticsPanel(statisticsMock);
        statisticsMock.userNames().add("Aqq");
        statisticsMock.postsCount();
        statisticsMock.commentsCount();
        when(statisticsMock.postsCount()).thenReturn(resultPostCountEq0);

        //When
        int postCountEq0 = statisticsPanel.


    }

    @Test
    public void testCalculateAdvStatisticsWith1000Posts() {

    }

    @Test
    public void testCalculateAdvStatisticsWith0Comments() {

    }

    @Test
    public void testCalculateAdvStatisticsWithCommentsLtPosts() {

    }

    @Test
    public void testCalculateAdvStatisticsWithCommentsGtPosts() {

    }

    @Test
    public void testCalculateAdvStatisticsWith0Users() {

    }

    @Test
    public void testCalculateAdvStatisticsWith100Users() {

    }
}
