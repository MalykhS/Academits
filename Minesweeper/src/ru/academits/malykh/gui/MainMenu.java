package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

import javax.swing.*;
import java.awt.*;

public class MainMenu implements View {
    private final JFrame frame = new JFrame();
    private final JButton newGame = new JButton("New game");
    private final JButton highScores = new JButton("High scores");
    private final JButton about = new JButton("About");
    private final JButton exit = new JButton("Exit");

    public void createFrame() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(300, 300));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void createContent() {
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = c1.gridy = 0;
        c1.gridwidth = 2;
        c1.gridheight = 1;
        c1.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c1.insets = new Insets(-150, 0, 0, 0);
        newGame.setPreferredSize(new Dimension(120, 30));
        panel.add(newGame, c1);

        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = c2.gridy = 0;
        c2.gridwidth = 2;
        c2.gridheight = 1;
        c2.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c2.insets = new Insets(-50, 0, 0, 0);
        highScores.setPreferredSize(new Dimension(120, 30));
        panel.add(highScores, c2);

        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = c3.gridy = 0;
        c3.gridwidth = 2;
        c3.gridheight = 1;
        c3.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c3.insets = new Insets(50, 0, 0, 0);
        about.setPreferredSize(new Dimension(120, 30));
        panel.add(about, c3);

        GridBagConstraints c4 = new GridBagConstraints();
        c4.gridx = c4.gridy = 0;
        c4.gridwidth = 2;
        c4.gridheight = 1;
        c4.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c4.insets = new Insets(150, 0, 0, 0);
        exit.setPreferredSize(new Dimension(120, 30));
        panel.add(exit, c4);

        frame.setContentPane(panel);

        newGame.addActionListener(e -> {
            SelectMenu selectMenu = new SelectMenu();
            selectMenu.createFrame();
            selectMenu.createContent();
        });

        exit.addActionListener(e -> System.exit(1));
    }
}
