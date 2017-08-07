package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

import java.util.Objects;

public class Fahrenheit implements TemperatureConverter {
    private String key;

    public Fahrenheit() {
    }

    public Fahrenheit(String key) {
        this.key = key;
    }

    @Override
    public double convert(double degree) {
        if (Objects.equals(key, "FromCelsiusToFahrenheit")) {
            return degree + 32;
        } else if (Objects.equals(key, "FromFahrenheitToCelsius")) {
            return degree - 32;
        } else {
            return 0;
        }
    }
}
