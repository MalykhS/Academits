import ru.academits.malykh.gui.*;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainMenu().init());
    }
}
