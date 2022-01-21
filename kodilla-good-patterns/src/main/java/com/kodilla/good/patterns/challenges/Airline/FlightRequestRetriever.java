package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;

public class FlightRequestRetriever {
    public FlightRequest retrieveFlightsFrom(String city) {
        return new FlightRequest(new Connection(city, ""));
    }
    public FlightRequest retrieveFlightsTo(String city) {
        return new FlightRequest(new Connection("", city));
    }
    public FlightRequest retrieveConnection(String origin, String destination) {
        return new FlightRequest(new Connection(origin, destination));
    }
    public HashSet<Connection> retrieveConn() {
        HashSet<Connection> conn = new HashSet<>();
        conn.add(new Connection("Warszawa", "Gdańsk"));
        conn.add(new Connection("Warszawa", "Wrocław"));
        conn.add(new Connection("Warszawa", "Kraków"));
        conn.add(new Connection("Wrocław", "Warszawa"));
        conn.add(new Connection("Wrocław", "Kraków"));
        conn.add(new Connection("Wrocław", "Rzeszów"));
        conn.add(new Connection("Gdańsk", "Warszawa"));
        conn.add(new Connection("Gdańsk", "Kraków"));
        conn.add(new Connection("Gdańsk", "Rzeszów"));
        conn.add(new Connection("Kraków", "Warszawa"));
        conn.add(new Connection("Kraków", "Wrocław"));
        conn.add(new Connection("Kraków", "Gdańsk"));
        return conn;
    }
}
