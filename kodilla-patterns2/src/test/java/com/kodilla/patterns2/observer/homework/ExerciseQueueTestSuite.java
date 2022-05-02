package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");

        ExerciseQueue exerciseQueue1 = new ExerciseQueue("Queue 1");
        ExerciseQueue exerciseQueue2 = new ExerciseQueue("Queue 2");
        ExerciseQueue exerciseQueue3 = new ExerciseQueue("Queue 3");

        exerciseQueue1.registerObserver(mentor1);
        exerciseQueue2.registerObserver(mentor2);
        exerciseQueue3.registerObserver(mentor1);

        //When
        exerciseQueue1.addExercise(new Exercise(1, "exercise 1"));
        exerciseQueue2.addExercise(new Exercise(1, "exercise 1"));
        exerciseQueue3.addExercise(new Exercise(3, "exercise 3"));
        exerciseQueue2.addExercise(new Exercise(8, "exercise 8"));
        exerciseQueue3.addExercise(new Exercise(2, "exercise 2"));

        //Then
        assertEquals(3, mentor1.getExerciseCount());
        assertEquals(2, mentor2.getExerciseCount());
    }
}
