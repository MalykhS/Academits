package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

import java.util.Objects;

public class Kelvin implements TemperatureConverter {
    private String key;

    public Kelvin() {}

    public Kelvin(String key) {
        this.key = key;
    }
    @Override
    public double convert(double degree) {
        if (Objects.equals(key, "FromCelsiusToKelvin")) {
            return degree + 273;
        } else if (Objects.equals(key, "FromKelvinToCelsius")) {
            return degree - 273;
        } else {
            return 0;
        }
    }
}
