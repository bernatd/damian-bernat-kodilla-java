package com.kodilla.good.patterns.challenges.Airline;

public class Connection {
    private String origin;
    private String destination;

    public Connection(String origin, String destination) {
        if (origin.equals("")) {
            this.origin = null;
            this.destination = destination;
        } else if (destination.equals("")) {
            this.destination = null;
            this.origin = origin;
        } else {
            this.origin = origin;
            this.destination = destination;
        }
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Connection)) return false;
        Connection connection = (Connection) o;
        return origin.equals(connection.origin) && destination.equals(connection.destination);

    }

    @Override
    public int hashCode() {
        int result = origin != null ? origin.hashCode() : 0;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
