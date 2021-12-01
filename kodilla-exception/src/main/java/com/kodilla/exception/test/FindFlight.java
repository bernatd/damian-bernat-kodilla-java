package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public String findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> operatedRoutes = new HashMap<>();
        operatedRoutes.put("Schipol", true);
        operatedRoutes.put("Chopin", true);
        operatedRoutes.put("Berlin", false);

        if (operatedRoutes.containsKey(flight.getArrivalAirport())) {
            //We can do this flight
            if (operatedRoutes.get(flight.getArrivalAirport())) {
                return "Operational";
            } else {
                return "Not operational";
            }
        } else {
            throw new RouteNotFoundException("We do not fly there!");
        }
    }
}
