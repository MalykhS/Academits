package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class ConvertToFahrenheit implements TemperatureConverter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConvertToFahrenheit(String name) {
        this.name = name;
    }

    @Override
    public double convertToCelsius(double degree) {
        return degree * 1.8 + 32;
    }

    @Override
    public double convertFromCelsius(double degree) {
        return (degree - 32) * 5 / 9;
    }

    @Override

    public String toString() {
        return name;
    }
}
