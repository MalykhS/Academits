package ru.academits.malykh.gui;

import ru.academits.malykh.common.CreateMines;
import ru.academits.malykh.common.View;

public class MediumLevel implements View, CreateMines {
    private final Field field = new Field(new Cell[16][16], 30);

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
