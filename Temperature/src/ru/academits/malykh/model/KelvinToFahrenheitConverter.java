package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class KelvinToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double kelvin) {
        return kelvin - 459.67;
    }
}
