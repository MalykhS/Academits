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
    public double convert(double degree) {
        if (Objects.equals(key, "FromCelsiusToFahrenheit")) {
            return degree * 9 / 5 + 32;
        } else if (Objects.equals(key, "FromFahrenheitToCelsius")) {
            return (degree - 32) * 5 / 9;
        } else {
            return 0;
        }
    }
}
