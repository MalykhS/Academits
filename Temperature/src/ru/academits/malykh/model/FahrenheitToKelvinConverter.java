package ru.academits.malykh.model;

import ru.academits.malykh.common.TemperatureConverter;

public class FahrenheitToKelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double fahrenheit) {
        return fahrenheit + 255.37;
    }
}
