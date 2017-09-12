package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

public class EasyLevel implements View {
    private final Field field = new Field(new Cell[9][9], 10);

    @Override
    public void init() {
        field.createPlayingField();
        field.createContentPlayingField();
        field.createMines();
        field.setCellValues();
    }
}
