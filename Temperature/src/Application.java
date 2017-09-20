import ru.academits.malykh.common.TemperatureConverter;
import ru.academits.malykh.common.View;
import ru.academits.malykh.controller.Controller;
import ru.academits.malykh.gui.FrameView;
import ru.academits.malykh.model.*;

public class Application {
    public static void main(String[] args) {
        View view = new FrameView();

        TemperatureConverter converter = new Kelvin();
        view.addTemperatureConverter(converter);
        Controller controller = new Controller(converter, view);
        view.addViewListener(controller);

        TemperatureConverter converter2 = new Fahrenheit();
        view.addTemperatureConverter(converter2);
        Controller controller2 = new Controller(converter2, view);
        view.addViewListener(controller2);

        TemperatureConverter converter1 = new Celsius();
        view.addTemperatureConverter(converter1);
        Controller controller1 = new Controller(converter1, view);
        view.addViewListener(controller1);

        view.startApplication();
    }
}
