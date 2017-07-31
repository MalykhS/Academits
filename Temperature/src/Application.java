import ru.academits.malykh.common.TemperatureConverter;
import ru.academits.malykh.common.View;
import ru.academits.malykh.controller.Controller;
import ru.academits.malykh.gui.FrameView;
import ru.academits.malykh.model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        View view = new FrameView();

        Controller controller = new Controller(view);

        view.addViewListener(controller);

        view.startApplication();
    }
}
