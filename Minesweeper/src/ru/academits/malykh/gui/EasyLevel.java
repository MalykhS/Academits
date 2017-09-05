package ru.academits.malykh.gui;

import ru.academits.malykh.common.CreateMines;
import ru.academits.malykh.common.View;

public class EasyLevel implements View, CreateMines {
    private final Field field = new Field(new Cell[9][9], 10);

    public void createFrame() {
        field.createPlayingField();
    }

    @Override
    public void createContent() {
        field.createContentPlayingField();
    }

    @Override
    public void createMines() {
        field.createMines();
    }
}
