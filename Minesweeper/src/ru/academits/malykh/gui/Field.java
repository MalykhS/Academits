package ru.academits.malykh.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Field {
    private Cell[][] cells;
    private int bombCount;
    private JFrame playingField = new JFrame();
    private int cellId = 0;

    Field(Cell[][] cells, int bombCount) {
        this.cells = cells;
        this.bombCount = bombCount;
    }

    public int getID() {
        int id = cellId;
        cellId++;
        return id;
    }

    public Cell getCell(int id) {
        for (Cell[] a : cells) {
            for (Cell b : a) {
                if (b.getId() == id) {
                    return b;
                }
            }
        }
        return null;
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

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(this);
                cells[i][j].setId(getID());
                panel.add(cells[i][j].getButton());
            }
        }

        playingField.setContentPane(panel);
        playingField.pack();
    }

    private ArrayList<Integer> generateMinesLocation(int bombCount) {
        this.bombCount = bombCount;
        ArrayList<Integer> list = new ArrayList<>();
        int random;
        for (int i = 0; i < bombCount; ) {
            random = (int) (Math.random() * (cells.length * cells.length));
            if (!list.contains(random)) {
                list.add(random);
                i++;
            }
        }
        return list;
    }

    void createMines() {
        ArrayList<Integer> list = generateMinesLocation(bombCount);
        for (int i : list) {
            getCell(i).setValue(-1);
        }
    }

    private void forEach(Consumer<Cell> consumer) {
        Stream.of(cells).forEach(row -> Stream.of(row).forEach(consumer));
    }

    private IntStream sideOf(int value) {
        return IntStream.rangeClosed(value - 1, value + 1).filter(x -> x >= 0 && x < cells.length);
    }

    private Set<Cell> getSurroundingCells(int x, int y) {
        Set<Cell> result = new HashSet<>();
        sideOf(x).forEach(a -> sideOf(y).forEach(b -> result.add(cells[a][b])));
        result.remove(cells[x][y]);
        return result;
    }

    public void setCellValues() {
        IntStream.range(0, cells.length).forEach(x -> {
            IntStream.range(0, cells.length).forEach(y -> {
                if (!cells[x][y].isMine()) {
                    getSurroundingCells(x, y).stream().filter(Cell::isMine).forEach(z -> cells[x][y].incrementValue());
                }
            });
        });
    }

    void scanEmptyCells() {
        IntStream.range(0, cells.length).forEach(x -> {
            IntStream.range(0, cells.length).forEach(y -> {
                if (cells[x][y].isClicked()) {
                    getSurroundingCells(x, y).stream().filter(Cell::isEmpty).forEach(Cell::checkCell);
                }
            });
        });
    }

    boolean isDone() {
        int[] result = new int[1];
        forEach(cell -> {
            if (cell.isEmpty()) {
                result[0]++;
            }
        });
        return result[0] == bombCount;
    }

    void reveal(Color color) {
        forEach(cell -> cell.reveal(color));
    }
}


