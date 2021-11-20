package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
        temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAvgTemp() {
        ArrayList<Double> temps = new ArrayList<>();
        Double s = 0.0;
        for (Map.Entry<String, Double> temperature :
        temperatures.getTemperatures().entrySet()) {
            temps.add(temperature.getValue());
        }
        for (int i = 0; i < temps.size(); i++) {
            s += temps.get(i);
        }
        return s / temps.size();
    }

    public double calculateMedianTemp() {
        ArrayList<Double> temps = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temps.add(temperature.getValue());
        }
        Collections.sort(temps);
        if (temps.size()%2 == 1) {
            return temps.get((temps.size() + 1) / 2 - 1);
        } else {
            return (temps.get(temps.size()/2) + temps.get(temps.size()/2 - 1)) / 2;
        }
    }
}
