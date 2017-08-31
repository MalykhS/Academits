package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

public class HardLevel implements View {
    private final Field field = new Field(new Cell[16][30]);

    public void createFrame() {
        field.createPlayingField();
    }

    @Override
    public void createContent() {
        field.createContentPlayingField();
    }
}
