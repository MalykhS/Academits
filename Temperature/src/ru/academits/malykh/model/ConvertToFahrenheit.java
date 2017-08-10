package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

import java.util.Objects;

public class ConvertToFahrenheit implements TemperatureConverter {
    private String key;

    public ConvertToFahrenheit() {
    }

    public ConvertToFahrenheit(String key) {
        this.key = key;
    }

    @Override
    public double convertToCelsius(double degree) {
        if (Objects.equals(key, "FromCelsiusToFahrenheit")) {
            return degree * 1.8 + 32;
        }
        return 0;
    }

    @Override
    public double convertFromCelsius(double degree) {
        if (Objects.equals(key, "FromFahrenheitToCelsius")) {
            return (degree - 32) * 5/9;
        }
        return 0;
    }
}
