import ru.academits.malykh.gui.*;

public class Application {
    public static void main(String[] args) {
       /* MainMenu frameView = new MainMenu();
        frameView.createFrame();
        frameView.createContent(); */

        SelectMenu selectMenu = new SelectMenu();
        selectMenu.createFrame();
        selectMenu.createContent();


       /* HardLevel hardLevel = new HardLevel();
        hardLevel.createFrame();
        hardLevel.createContent(); */
    }
}
