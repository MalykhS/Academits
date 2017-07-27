package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class CelsiusToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
}
