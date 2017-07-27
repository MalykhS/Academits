package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class KelvinToCelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double kelvin) {
        return kelvin - 273.15;
    }
}
