package ru.academits.malykh.controller;

import ru.academits.malykh.common.View;
import ru.academits.malykh.common.ViewListener;

public class Controller implements ViewListener{
    private final View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void convertTemperature(double degree) {
        view.onTemperatureConverted(degree);
    }
}
