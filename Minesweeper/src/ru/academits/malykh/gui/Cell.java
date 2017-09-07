package ru.academits.malykh.gui;

import javax.swing.*;
import java.awt.*;

public class Cell {
    private JButton button;
    private int id;
    private Field field;
    private int value;
    private boolean clicked;

    JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    Cell(Field field) {
        button = new JButton();
        button.setPreferredSize(new Dimension(25, 25));
        this.field = field;
        button.addActionListener(listener -> this.checkCell());
    }

    boolean isEmpty() {
        return !isClicked() && value == 0;
    }

    boolean isMine() {
        return value == -1;
    }

    void checkCell() {
        reveal(null);
        if (isMine() || field.isDone()) {
            field.reveal(isMine() ? Color.RED : Color.GREEN);
        } else if (value == 1) {
            field.scanEmptyCells();
        }
    }

    private void displayValue(Color color) {
        if (value == -1) {
            button.setText("*");
            button.setBackground(color);
        } else if (value != 0) {
            button.setText(String.valueOf(value));
        }
    }

    void reveal(Color color) {
        displayValue(color);
        clicked = true;
        button.setEnabled(false);
    }

    void incrementValue() {
        value++;
    }

    boolean isClicked() {
        return clicked;
    }
}
