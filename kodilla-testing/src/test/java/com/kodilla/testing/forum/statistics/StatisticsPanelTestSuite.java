package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
        System.out.println();
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println();
    }

    @Test
    public void testCalculateAdvStatisticsWith0Posts() {
        //Given
        String[] users = {"User1", "User2", "User3"};
        List<String> usersNames = Arrays.asList(users);
        int resultPostCount = 0;
        int resultCommentsCount = 100;
        StatisticsPanel statisticsPanel = new StatisticsPanel(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);
        when(statisticsMock.userNames()).thenReturn(usersNames);

        //When
        statisticsPanel.calculateAdvStatistics(statisticsMock);
        statisticsPanel.showStatistics();

        //Then
        assertEquals(0, statisticsPanel.postCount());

    }

    @Test
    public void testCalculateAdvStatisticsWith1000Posts() {
        //Given
        String[] users = {"User1", "User2", "User3"};
        List<String> usersNames = Arrays.asList(users);
        int resultPostCount = 1000;
        int resultCommentsCount = 100;
        StatisticsPanel statisticsPanel = new StatisticsPanel(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);
        when(statisticsMock.userNames()).thenReturn(usersNames);

        //When
        statisticsPanel.calculateAdvStatistics(statisticsMock);
        statisticsPanel.showStatistics();

        //Then
        assertEquals(1000, statisticsPanel.postCount());
    }

    @Test
    public void testCalculateAdvStatisticsWith0Comments() {
        //Given
        String[] users = {"User1", "User2", "User3"};
        List<String> usersNames = Arrays.asList(users);
        int resultPostCount = 150;
        int resultCommentsCount = 0;
        StatisticsPanel statisticsPanel = new StatisticsPanel(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);
        when(statisticsMock.userNames()).thenReturn(usersNames);

        //When
        statisticsPanel.calculateAdvStatistics(statisticsMock);
        statisticsPanel.showStatistics();

        //Then
        assertEquals(0, statisticsPanel.commentsCount());
    }

    @Test
    public void testCalculateAdvStatisticsWithCommentsLtPosts() {
        //Given
        String[] users = {"User1", "User2", "User3"};
        List<String> usersNames = Arrays.asList(users);
        int resultPostCount = 200;
        int resultCommentsCount = 100;
        StatisticsPanel statisticsPanel = new StatisticsPanel(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);
        when(statisticsMock.userNames()).thenReturn(usersNames);

        //When
        statisticsPanel.calculateAdvStatistics(statisticsMock);
        statisticsPanel.showStatistics();

        //Then
        assertTrue(statisticsPanel.postCount() > statisticsPanel.commentsCount());
    }

    @Test
    public void testCalculateAdvStatisticsWithCommentsGtPosts() {
        //Given
        String[] users = {"User1", "User2", "User3"};
        List<String> usersNames = Arrays.asList(users);
        int resultPostCount = 200;
        int resultCommentsCount = 1000;
        StatisticsPanel statisticsPanel = new StatisticsPanel(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);
        when(statisticsMock.userNames()).thenReturn(usersNames);

        //When
        statisticsPanel.calculateAdvStatistics(statisticsMock);
        statisticsPanel.showStatistics();

        //Then
//        assertEquals(0, statisticsPanel.commentsCount());
        assertTrue(statisticsPanel.commentsCount() > statisticsPanel.postCount());
    }

    @Test
    public void testCalculateAdvStatisticsWith0Users() {
        //Given
        String[] users = {};
        List<String> usersNames = Arrays.asList(users);
        int resultPostCount = 200;
        int resultCommentsCount = 100;
        StatisticsPanel statisticsPanel = new StatisticsPanel(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);
        when(statisticsMock.userNames()).thenReturn(usersNames);

        //When
        statisticsPanel.calculateAdvStatistics(statisticsMock);
        statisticsPanel.showStatistics();

        //Then
        assertEquals(0, statisticsPanel.userNames().size());
    }

    @Test
    public void testCalculateAdvStatisticsWith1000Users() {
        //Given
       String[] users = new String[1000];
        for (int i = 0; i < users.length; i++) {
            users[i] = "User" + i;
        }
        List<String> usersNames = Arrays.asList(users);
        int resultPostCount = 20000;
        int resultCommentsCount = 150000;
        StatisticsPanel statisticsPanel = new StatisticsPanel(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);
        when(statisticsMock.userNames()).thenReturn(usersNames);

        //When
        statisticsPanel.calculateAdvStatistics(statisticsMock);
        statisticsPanel.showStatistics();

        //Then
        assertEquals(1000, statisticsPanel.userNames().size());
    }
}
