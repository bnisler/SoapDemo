package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Ben on 2/17/2017.
 */
public class TemperatureConversionsTest {
    @Test
    public void getCelsiusToFahrenheit() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celsius to fahrenheit conversion failed",
                celsiusToFahrenheitResult, BigDecimal.valueOf(32));
    }

    @Test
    public void getFahrenheitToCelsius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));
        assertEquals("The fahrenheit to celsius conversion failed",
                fahrenheitToCelsiusResult, BigDecimal.valueOf(0));
    }

    @Test
    public void getWindChillInCelsius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInCelsiusResult = service.windChillInCelsius(BigDecimal.valueOf(0.0), BigDecimal.valueOf(5));
        assertEquals("Wind chill in celsius failed",
                windChillInCelsiusResult, BigDecimal.valueOf(-4.09));
    }

    @Test
    public void getWindChillInFahrenheit() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(0.0), BigDecimal.valueOf(5));
        assertEquals("Wind chill in fahrenheit failed",
                windChillInFahrenheit, BigDecimal.valueOf(-9.68199988));
    }
}