import ru.academits.malykh.common.TemperatureConverter;
import ru.academits.malykh.common.View;
import ru.academits.malykh.controller.Controller;
import ru.academits.malykh.gui.FrameView;
import ru.academits.malykh.model.*;

public class Application {
    public static void main(String[] args) {
        View view = new FrameView();

        TemperatureConverter converter = new ConvertToKelvin();
        view.addTemperatureConverter(converter, "FromCelsiusToKelvin");
        view.addTemperatureConverter(converter, "FromKelvinToCelsius");
        Controller controller = new Controller(converter, view);
        view.addViewListener(controller);

        TemperatureConverter converter1 = new ConvertToFahrenheit();
        view.addTemperatureConverter(converter1, "FromCelsiusToFahrenheit");
        view.addTemperatureConverter(converter1, "FromFahrenheitToCelsius");
        Controller controller1 = new Controller(converter1, view);
        view.addViewListener(controller1);

        TemperatureConverter converter2 = new ConvertFromKelvinToFahrenheit();
        view.addTemperatureConverter(converter2, "FromKelvinToFahrenheit");
        view.addTemperatureConverter(converter2, "FromFahrenheitToKelvin");
        Controller controller2 = new Controller(converter2, view);
        view.addViewListener(controller2);

        view.startApplication();
    }
}
