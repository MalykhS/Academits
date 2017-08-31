package ru.academits.malykh.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cell implements ActionListener {
    private final JButton button = new JButton();
    private int id;

    public Cell() {
        button.addActionListener(this);
        button.setPreferredSize(new Dimension(25, 25));
    }

    public JButton getButton() {
        return button;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
