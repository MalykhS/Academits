package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class ConvertToKelvin implements TemperatureConverter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConvertToKelvin(String name) {

        this.name = name;
    }

    @Override
    public double convertToCelsius(double degree) {
        return degree + 273;
    }

    @Override
    public double convertFromCelsius(double degree) {
        return degree - 273;
    }

    @Override

    public String toString() {
        return name;
    }
}
