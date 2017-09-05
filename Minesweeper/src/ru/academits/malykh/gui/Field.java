package ru.academits.malykh.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Field {
    private Cell[][] cells;
    private int bombCount;
    private JButton[][] buttons;
    private JFrame playingField = new JFrame();

    Field(Cell[][] cells, int bombCount) {
        this.cells = cells;
        this.bombCount = bombCount;
    }

    void createPlayingField() {
        playingField.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        playingField.setResizable(false);
        playingField.setLocationRelativeTo(null);
        playingField.setVisible(true);
    }

    void createContentPlayingField() {
        int length = cells.length;

        JPanel panel = new JPanel(new GridLayout(length, length));

        buttons = new JButton[cells.length][cells.length];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setPreferredSize(new Dimension(25, 25));
                panel.add(buttons[i][j]);
            }
        }

        playingField.setContentPane(panel);
        playingField.pack();
    }

    void createMines() {
        Random random = new Random();
        for (int k = 0; k < bombCount; k++) {
            int x = random.nextInt(cells.length);
            int y = random.nextInt(cells[0].length);
            System.out.println(x + " " + y);

            buttons[x][y].setBackground(Color.CYAN);
        }
    }


}


