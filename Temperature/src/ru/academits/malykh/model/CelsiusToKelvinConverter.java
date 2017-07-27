package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class CelsiusToKelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
