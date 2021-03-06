package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class Kelvin implements TemperatureConverter {

    @Override
    public double convertToCelsius(double degree) {
        return degree - 273.15;
    }

    @Override
    public double convertFromCelsius(double degree) {
        return degree + 273.15;
    }

    @Override

    public String toString() {
        return "Kelvin";
    }
}
