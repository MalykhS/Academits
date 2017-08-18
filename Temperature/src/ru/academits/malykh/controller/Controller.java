package ru.academits.malykh.controller;

import ru.academits.malykh.common.TemperatureConverter;
import ru.academits.malykh.common.View;
import ru.academits.malykh.common.ViewListener;

public class Controller implements ViewListener {
    private final TemperatureConverter temperatureConverter;
    private final View view;

    public Controller(TemperatureConverter converter, View view) {
        this.temperatureConverter = converter;
        this.view = view;
    }

    @Override
    public void convertTemperature(double degree) {
        view.onTemperatureConverted(temperatureConverter.convertToCelsius(degree));
    }
}
