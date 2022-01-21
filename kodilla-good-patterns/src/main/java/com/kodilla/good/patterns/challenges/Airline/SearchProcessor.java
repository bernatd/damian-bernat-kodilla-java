package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;

public class SearchProcessor {
    private SearchService searchService;

    public SearchProcessor(final SearchService searchService) {
        this.searchService = searchService;
    }

    public SearchDto processFlightsFrom(final HashSet<Connection> connectionList, FlightRequest flightRequest) {
        boolean isAvailable = searchService.searchFrom(connectionList, flightRequest);

        if (!isAvailable) {
            System.out.println("We are sorry, we do not have such connection.");
        }
        return new SearchDto(flightRequest.getConnection(), isAvailable);
    }

    public SearchDto processFlightsTo(final HashSet<Connection> connectionList, FlightRequest flightRequest) {
        boolean isAvailable = searchService.searchTo(connectionList, flightRequest);

        if (!isAvailable) {
            System.out.println("We are sorry, we do not have such connection.");
        }
        return new SearchDto(flightRequest.getConnection(), isAvailable);
    }

    public SearchDto processConnection(final HashSet<Connection> connectionList, FlightRequest flightRequest) {
        boolean isAvailable = searchService.searchConnection(connectionList, flightRequest);

        if (!isAvailable) {
            System.out.println("We are sorry, we do not have such connection.");
        }
        return new SearchDto(flightRequest.getConnection(), isAvailable);
    }
}
