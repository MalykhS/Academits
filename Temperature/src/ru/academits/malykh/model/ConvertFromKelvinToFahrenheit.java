package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

import java.util.Objects;

public class ConvertFromKelvinToFahrenheit implements TemperatureConverter {
    private String key;

    public ConvertFromKelvinToFahrenheit() {
    }

    public ConvertFromKelvinToFahrenheit(String key) {
        this.key = key;
    }

    @Override
    public double convert(double degree) {
        if (Objects.equals(key, "FromKelvinToFahrenheit")) {
            return (degree - 273.15) * 9 / 5 + 32;
        } else if (Objects.equals(key, "FromFahrenheitToKelvin")) {
            return (degree - 32) * 5 / 9 + 273.15;
        }
        return 0;
    }
}
