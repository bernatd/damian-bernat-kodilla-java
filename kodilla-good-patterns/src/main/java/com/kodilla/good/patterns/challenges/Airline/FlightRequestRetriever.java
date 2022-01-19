package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;

public class FlightRequestRetriever {
//    public FlightRequest retrieve() {
//        return new FlightRequest(new Connection("Warszawa", "Wrocław"));
//    }
/*    public FlightRequest retrieve() {
        return new FlightRequest(new Connection("Warszawa", ""));
    }*/
    public FlightRequest retrieve() {
        return new FlightRequest(new Connection("Warszawa", "Kraków"));
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
