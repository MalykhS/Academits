package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

public class HardLevel implements View {
    private final Field field = new Field(new Cell[16][30], 99);

    @Override
    public void init() {
        field.createPlayingField();
        field.createContentPlayingField();
        field.createMines();
    }
}
