package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

public class MediumLevel implements View {
    private final Cell cell = new Cell(new Cell[16][16]);

    public void createFrame() {
        cell.createPlayingField();
    }

    @Override
    public void createContent() {
        cell.createContentPlayingField();
    }
}
