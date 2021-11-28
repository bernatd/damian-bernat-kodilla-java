package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    public final List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        BigDecimal result = continents.stream()
                .flatMap(continent -> continent.countries.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return result;
    }
}
