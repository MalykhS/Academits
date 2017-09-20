package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class Fahrenheit implements TemperatureConverter {

    @Override
    public double convertToCelsius(double degree) {
        return (degree - 32) * 5 / 9;
    }

    @Override
    public double convertFromCelsius(double degree) {
        return degree * 1.8 + 32;
    }

    @Override

    public String toString() {
        return "Fahrenheit";
    }
}
