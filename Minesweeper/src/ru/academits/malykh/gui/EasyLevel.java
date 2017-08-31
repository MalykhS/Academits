package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

public class EasyLevel implements View {
    private final Field field = new Field(new Cell[9][9]);

    public void createFrame() {
        field.createPlayingField();
    }

    @Override
    public void createContent() {
        field.createContentPlayingField();
    }
}
