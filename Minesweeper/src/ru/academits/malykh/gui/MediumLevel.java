package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

public class MediumLevel implements View {
    private final Field field = new Field(new Cell[16][16], 30);

    @Override
    public void init() {
        field.createPlayingField();
        field.createContentPlayingField();
        field.createMines();
        field.setCellValues();
    }
}
