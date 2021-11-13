package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator calculator = new Calculator();

        String result = simpleUser.getUsername();

        System.out.println("Test - pierwszy test jednostkowy:");

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - kalkulatora:");

        int add_result = calculator.add(12, 3);
        int sub_result = calculator.subtract(25, 15);

        if (add_result == 15) {
            System.out.println("Add operation OK");
        } else {
            System.out.println("Error!");
        }

        if (sub_result == 10) {
            System.out.println("Subtract operation OK");
        } else {
            System.out.println("Error!");
        }
    }
}
