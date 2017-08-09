package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

import java.util.Objects;

public class ConvertToKelvin implements TemperatureConverter {
    private String key;

    public ConvertToKelvin() {
    }

    public ConvertToKelvin(String key) {
        this.key = key;
    }

    @Override
    public double convertToCelsius(double degree) {
        if (Objects.equals(key, "FromCelsiusToKelvin")) {
            return degree + 273;
        }
        return 0;
    }

    @Override
    public double convertFromCelsius(double degree) {
        if (Objects.equals(key, "FromKelvinToCelsius")) {
            return degree - 273;
        }
        return 0;
    }
}
