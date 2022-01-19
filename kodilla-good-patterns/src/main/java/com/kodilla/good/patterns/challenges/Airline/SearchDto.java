package com.kodilla.good.patterns.challenges.Airline;

public class SearchDto {
    public Connection connection;
    public boolean isAvailable;

    public SearchDto(final Connection connection, final boolean isAvailable) {
        this.connection = connection;
        this.isAvailable = isAvailable;
    }

    public Connection getConnection() {
        return connection;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
