package ru.academits.malykh.gui;

import javax.swing.*;

public class Cell {
    private JButton cell;

    public Cell(JButton cell) {
        this.cell = cell;
    }

    public JButton getCell() {

        return cell;
    }

    public void setCell(JButton cell) {
        this.cell = cell;
    }
}
