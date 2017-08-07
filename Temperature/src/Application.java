import ru.academits.malykh.common.TemperatureConverter;
import ru.academits.malykh.common.View;
import ru.academits.malykh.controller.Controller;
import ru.academits.malykh.gui.FrameView;
import ru.academits.malykh.model.*;

public class Application {
    public static void main(String[] args) {
        View view = new FrameView();

        TemperatureConverter converter = new Kelvin();
        view.addTemperatureConverter(converter, "FromCelsiusToKelvin");
        view.addTemperatureConverter(converter, "FromKelvinToCelsius");
        Controller controller = new Controller(converter, view);
        view.addViewListener(controller);

        TemperatureConverter converter1 = new Fahrenheit();
        view.addTemperatureConverter(converter1, "FromCelsiusToFahrenheit");
        Controller controller1 = new Controller(converter1, view);
        view.addViewListener(controller1);

        view.startApplication();
    }
}
