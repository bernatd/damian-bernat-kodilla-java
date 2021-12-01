package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 3.0 , y = 11;
        String result = "";

        try {
            result = secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            System.out.println(result);
        }
    }
}
