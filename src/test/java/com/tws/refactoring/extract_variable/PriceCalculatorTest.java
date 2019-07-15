package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void should_return_2600_when_call_getPrice_when_given_500_5(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(500,5);
        assertEquals(2600.0,result,0.1);
    }

    @Test
    public void should_return_1100_when_call_getPrice_when_given_200_5(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(200,5);
        assertEquals(1100.0,result,0.1);
    }

    @Test
    public void should_return_440_when_call_getPrice_when_given_200_2(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(200,2);
        assertEquals(440.0,result,0.1);
    }

    @Test
    public void should_return_1100_when_call_getPrice_when_given_500_2(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(500,2);
        assertEquals(1100.0,result,0.1);
    }
}