package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args) {


        Flight flight1 = new Flight("Chopin", "Schipol");
        Flight flight2 = new Flight("Chopin", "Berlin");
        Flight flight3 = new Flight("Chopin", "Wladivostock");
        FindFlight newSearch = new FindFlight();
        String result = "";

        try {
            result = newSearch.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println(result);
        }
    }
}
