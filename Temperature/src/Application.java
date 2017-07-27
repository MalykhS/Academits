import ru.academits.malykh.common.TemperatureConverter;
import ru.academits.malykh.common.View;
import ru.academits.malykh.controller.Controller;
import ru.academits.malykh.gui.FrameView;
import ru.academits.malykh.model.CelsiusToKelvinConverter;
import ru.academits.malykh.model.FahrenheitToKelvinConverter;

public class Application {
    public static void main(String[] args) {
        View view = new FrameView();

        TemperatureConverter converter = new FahrenheitToKelvinConverter();

        Controller controller = new Controller(converter, view);

        view.addViewListener(controller);

        view.startApplication();
    }
}
