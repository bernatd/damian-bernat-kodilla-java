package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ala ma kota", (text) -> "ABC " + text + " ABC" );
        poemBeautifier.beautify("Lambda expressions", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Kodilla Module 7", (text) -> "<-- " + text + " -->" );
        poemBeautifier.beautify("This is an example text", (text) -> "\033[3m" + text + "\033[0m" );

        System.out.println("\nCalculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a,b) -> a+b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a-b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a*b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a/b);

        System.out.println("\nCalculating expressions with method reference");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);
    }
}
