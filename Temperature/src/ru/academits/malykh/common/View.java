package ru.academits.malykh.common;

public interface View extends AutoCloseable {
    void startApplication();

    //void onTemperatureConverted(double convertedTemperature);

    void addViewListener(ViewListener listener);

    void removeViewListener(ViewListener viewListener);
}
