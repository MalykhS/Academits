package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class FahrenheitToCelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }
}
