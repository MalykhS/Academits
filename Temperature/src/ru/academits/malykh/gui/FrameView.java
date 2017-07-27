package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;
import ru.academits.malykh.common.ViewListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrameView implements View {
    private final ArrayList<ViewListener> listeners = new ArrayList<>();

    private final JFrame frame = new JFrame("Temperature converter");
    private final JButton button = new JButton("Convert");
    private final JTextField textField = new JTextField(10);
    private final JLabel label = new JLabel("Enter temperature: ");
    private final JComboBox comboBox = new JComboBox();

    public void createFrame() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(300, 200));
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
                    for (ViewListener listener : listeners) {
                        listener.convertTemperature(temperature);
                    }

                } catch (NumberFormatException ex) {
                    label.setForeground(Color.red);
                    label.setText("It must be number!");
                }
            }
        });
    }

    @Override
    public void startApplication() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createContent();
                createFrame();
                initEvents();
            }
        });
    }

    @Override
    public void onTemperatureConverted(double convertedTemperature) {
        label.setText(Double.toString(convertedTemperature));
    }

    @Override
    public void addViewListener(ViewListener listener) {
        if (!listeners.add(listener)) {
            listeners.add(listener);
        }
    }

    @Override
    public void removeViewListener(ViewListener viewListener) {
        listeners.remove(viewListener);
    }

    @Override
    public void close() throws Exception {
        frame.setVisible(false);
    }
}

