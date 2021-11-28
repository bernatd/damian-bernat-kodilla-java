package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent();
        Continent northAmerica = new Continent();
        Continent asia = new Continent();

        Country Poland = new Country(new BigDecimal("40129802"));
        Country Germany = new Country(new BigDecimal("80982312"));
        Country Spain = new Country(new BigDecimal("47350000"));
        europe.countries.add(Poland);
        europe.countries.add(Germany);
        europe.countries.add(Spain);

        Country usa = new Country(new BigDecimal("140871265"));
        Country canada = new Country(new BigDecimal("23019347"));
        Country mexico = new Country(new BigDecimal("42847509"));

        northAmerica.countries.add(usa);
        northAmerica.countries.add(canada);
        northAmerica.countries.add(mexico);

        Country china = new Country(new BigDecimal("1237439823"));
        Country vietnam = new Country(new BigDecimal("34988123"));
        Country laos = new Country(new BigDecimal("2743974392"));

        asia.countries.add(china);
        asia.countries.add(vietnam);
        asia.countries.add(laos);

        world.continents.add(europe);
        world.continents.add(northAmerica);
        world.continents.add(asia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantity = new BigDecimal("4391602573");
        assertEquals(expectedQuantity, totalPeople);
    }
}
