package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int exerciseCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(ExerciseQueue exerciseQueue) {
        System.out.println(name + " New exercise in queue " + exerciseQueue.getName() + "\n" +
                " (total: " + exerciseQueue.getExercises().size() + " exercises)");
        exerciseCount++;
    }

    public String getName() {
        return name;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }
}
