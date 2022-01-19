package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;

public class SearchProcessor {
    private SearchService searchService;

    public SearchProcessor(final SearchService searchService) {
        this.searchService = searchService;
    }

    public SearchDto process(final HashSet<Connection> connectionList, FlightRequest flightRequest) {
        boolean isAvailable = searchService.search(connectionList, flightRequest);

        if (!isAvailable) {
            System.out.println("We are sorry, we do not have such connection.");
        }
        return new SearchDto(flightRequest.getConnection(), isAvailable);

    }
}
