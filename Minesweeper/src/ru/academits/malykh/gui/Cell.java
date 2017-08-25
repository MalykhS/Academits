package ru.academits.malykh.gui;

import javax.swing.*;
import java.awt.*;

class Cell {
    private Cell[][] cells;
    private JFrame playingField = new JFrame();

    Cell(Cell[][] cells) {
        this.cells = cells;
    }

    void createPlayingField() {
        playingField.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        playingField.setResizable(true);
        playingField.setLocationRelativeTo(null);
        playingField.setVisible(true);
    }

    void createContentPlayingField() {
        int length = cells.length;

        JPanel panel = new JPanel(new GridLayout(length, length));

        for (int i = 0; i < cells[0].length; i++) {
            for (Cell[] ignored : cells) {
                JButton b = new JButton();
                b.setPreferredSize(new Dimension(25, 25));
                panel.add(b);
            }
        }

        playingField.setContentPane(panel);
        playingField.pack();
    }
}
