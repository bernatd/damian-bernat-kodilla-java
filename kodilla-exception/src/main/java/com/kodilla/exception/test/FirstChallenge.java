package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by 0");
        }
        return a/b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
//        double result = firstChallenge.divide(3,0);
        double result = 0.0;
        try {
            result = firstChallenge.divide(3,0);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } finally {
            System.out.println(result);
        }
    }
}
