import ru.academits.malykh.gui.*;

public class Application {
    public static void main(String[] args) {
       /* MainMenu frameView = new MainMenu();
        frameView.createFrame();
        frameView.createContent(); */

        /*SelectMenu selectMenu = new SelectMenu();
        selectMenu.createFrame();
        selectMenu.createContent(); */


       EasyLevel easyLevel = new EasyLevel();
       easyLevel.createFrame();
       easyLevel.createContent();
       easyLevel.createMines();
    }
}
