package ru.academits.malykh.controller;

import ru.academits.malykh.common.TemperatureConverter;
import ru.academits.malykh.common.View;
import ru.academits.malykh.common.ViewListener;

public class Controller implements ViewListener {
    private final TemperatureConverter temperatureConverter;
    private final View view;

    public Controller(TemperatureConverter temperatureConverter, View view) {
        this.temperatureConverter = temperatureConverter;
        this.view = view;
    }

    @Override
    public void convertTemperature(double degree) {
        view.onTemperatureConverted(temperatureConverter.convert(degree));
    }
}
