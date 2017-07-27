package ru.academits.malykh.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameView {
    private final JFrame frame = new JFrame("Temperature converter");
    private final JButton button = new JButton("Convert");
    private final JTextField textField = new JTextField(10);
    private final JLabel label = new JLabel("Enter temperature: ");
    private final JComboBox comboBox = new JComboBox();

    public void createFrame() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMaximumSize(new Dimension(300, 200));
        frame.setBounds(300, 300, 300, 300);
        frame.setVisible(true);
    }

    public void createContent() {
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.gridx = constraints1.gridy = 0;
        constraints1.gridwidth = 2;
        constraints1.gridheight = 1;
        constraints1.anchor = GridBagConstraints.NORTHWEST;
        constraints1.insets = new Insets(10, 5, 10, 5);
        panel.add(label, constraints1);

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 2;
        constraints2.gridheight = 1;
        constraints2.insets = new Insets(10, 5, 10, 5);
        panel.add(textField, constraints2);

        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.gridx = 0;
        constraints3.gridy = 2;
        constraints3.gridwidth = 2;
        constraints3.gridheight = 1;
        constraints3.insets = new Insets(10, 5, 10, 5);
        panel.add(button, constraints3);

        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.gridx = 0;
        constraints4.gridy = 3;
        constraints4.gridwidth = 2;
        constraints4.gridheight = 1;

        frame.setContentPane(panel);
    }

    public void initEvents() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double temperature = Double.parseDouble(textField.getText());



                } catch (NumberFormatException ex) {
                    label.setText("It must be number!");
                }
            }
        });
    }
}

