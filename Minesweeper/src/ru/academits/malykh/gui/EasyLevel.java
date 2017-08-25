package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

public class EasyLevel implements View {
    private final Cell cell = new Cell(new Cell[9][9]);

    public void createFrame() {
        cell.createPlayingField();
    }

    @Override
    public void createContent() {
        cell.createContentPlayingField();
    }
}
