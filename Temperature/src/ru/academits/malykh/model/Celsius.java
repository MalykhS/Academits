package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class Celsius implements TemperatureConverter {

    @Override
    public double convertToCelsius(double degree) {
        return degree;
    }

    @Override
    public double convertFromCelsius(double degree) {

        return degree;
    }

    @Override
    public String toString() {
        return "Celsius";
    }
}
