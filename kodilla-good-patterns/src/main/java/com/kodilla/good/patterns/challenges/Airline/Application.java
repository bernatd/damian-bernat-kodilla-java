package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        HashSet<Connection> connectionsList = flightRequestRetriever.retrieveConn();
        SearchProcessor searchProcessor = new SearchProcessor(new SearchFlight());

        FlightRequest flightsFrom = flightRequestRetriever.retrieveFlightsFrom("Warszawa");
        searchProcessor.processFlightsFrom(connectionsList, flightsFrom);
        System.out.println();

        FlightRequest flightsTo = flightRequestRetriever.retrieveFlightsTo("Wrocław");
        searchProcessor.processFlightsTo(connectionsList, flightsTo);
        System.out.println();

        FlightRequest flightConnection = flightRequestRetriever.retrieveConnection("Warszawa", "Kraków");
        searchProcessor.processConnection(connectionsList, flightConnection);
    }
}
