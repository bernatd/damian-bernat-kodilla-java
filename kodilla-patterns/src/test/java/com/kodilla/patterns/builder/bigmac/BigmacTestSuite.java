package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient(Ingredient.ONION)
                .ingredient(Ingredient.BECKON)
                .ingredient(Ingredient.CHEESE)
                .build();

        System.out.println(bigmac);

        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        String bun = bigmac.getBun();
        String sauce = bigmac.getSauce();

        //Then
        assertEquals(2, howManyBurgers);
        assertEquals(3, howManyIngredients);
        assertEquals("with sesame", bun);
        assertEquals("1000 islands", sauce);
    }
}
