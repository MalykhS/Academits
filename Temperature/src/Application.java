import ru.academits.malykh.gui.FrameView;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        FrameView frameView = new FrameView();
        frameView.createFrame();
        frameView.createContent();
    }
}
