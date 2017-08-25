package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

public class HardLevel implements View {
    private final Cell cell = new Cell(new Cell[16][30]);

    @Override
    public void createFrame() {
        cell.createPlayingField();
    }

    @Override
    public void createContent() {
        cell.createContentPlayingField();
    }
}
