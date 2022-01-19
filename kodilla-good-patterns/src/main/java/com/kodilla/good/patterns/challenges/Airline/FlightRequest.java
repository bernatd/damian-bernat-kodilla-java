package com.kodilla.good.patterns.challenges.Airline;

public class FlightRequest {
    private final Connection connection;

    public FlightRequest(final Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }
}
