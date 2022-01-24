package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testTaskFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testTaskFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);

        //Then
        assertEquals("Painting", painting.getTaskName());
        assertFalse(painting.isTaskExecuted());
    }

    @Test
    void testTaskFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        //Then
        assertEquals("Driving", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}
