package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;
import ru.academits.malykh.common.ViewListener;
import ru.academits.malykh.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class FrameView implements View {
    private final ArrayList<ViewListener> listeners = new ArrayList<>();

    private final JFrame frame = new JFrame("Temperature converter");
    private final JButton button = new JButton("Convert");
    private final JTextField textField = new JTextField(10);
    private final JLabel label1 = new JLabel("Enter temperature: ");
    private final JLabel label2 = new JLabel();
    private final JComboBox<Object> comboBox = new JComboBox<>();

    private void createFrame() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400, 300));
        frame.setVisible(true);
    }

    private void createContent() {
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = c1.gridy = 0;
        c1.gridwidth = 2;
        c1.gridheight = 1;
        c1.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c1.insets = new Insets(-120, 5, -40, 5);
        panel.add(label1, c1);

        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = 0;
        c2.gridy = 1;
        c2.gridwidth = 2;
        c2.gridheight = 1;
        c2.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.weightx = 1.0;
        c2.insets = new Insets(-170, 5, -40, 5);
        panel.add(textField, c2);

        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 0;
        c3.gridy = 1;
        c3.gridwidth = 2;
        c3.gridheight = 1;
        c3.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c3.weightx = 1.0;
        c3.insets = new Insets(-110, 5, -40, 5);
        panel.add(button, c3);

        GridBagConstraints c4 = new GridBagConstraints();

        ArrayList<String> list = new ArrayList<>(Arrays.asList("CelsiusToFahrenheit", "CelsiusToKelvin",
                "FahrenheitToCelsius", "FahrenheitToKelvin", "KelvinToCelsius", "KelvinToFahrenheit"));

        c4.gridx = 0;
        c4.gridy = 1;
        c4.gridwidth = 2;
        c4.gridheight = 1;
        c4.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c4.weightx = 1.0;
        c4.insets = new Insets(150, 5, -40, 5);
        comboBox.setModel(new DefaultComboBoxModel<>(list.toArray()));
        panel.add(comboBox, c4);

        GridBagConstraints c5 = new GridBagConstraints();
        c5.gridx = 0;
        c5.gridy = 1;
        c5.gridwidth = 2;
        c5.gridheight = 1;
        c5.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c5.weightx = 1.0;
        c5.insets = new Insets(-30, 5, -40, 5);
        panel.add(label2, c5);

        frame.setContentPane(panel);
    }

    private void initEvents() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double temperature = Double.parseDouble(textField.getText());

                    for (ViewListener listener : listeners) {
                        listener.convertTemperature(temperature);
                    }

                    if (comboBox.getSelectedIndex() == 0) {
                        label2.setText(String.valueOf(new CelsiusToFahrenheitConverter().convert(temperature)));
                    } else if (comboBox.getSelectedIndex() == 1) {
                        label2.setText(String.valueOf(new CelsiusToKelvinConverter().convert(temperature)));
                    } else if (comboBox.getSelectedIndex() == 2) {
                        label2.setText(String.valueOf(new FahrenheitToCelsiusConverter().convert(temperature)));
                    } else if (comboBox.getSelectedIndex() == 3) {
                        label2.setText(String.valueOf(new FahrenheitToKelvinConverter().convert(temperature)));
                    } else if (comboBox.getSelectedIndex() == 4) {
                        label2.setText(String.valueOf(new KelvinToCelsiusConverter().convert(temperature)));
                    } else if (comboBox.getSelectedIndex() == 5) {
                        label2.setText(String.valueOf(new KelvinToFahrenheitConverter().convert(temperature)));
                    }

                } catch (NumberFormatException ex) {
                    label2.setText("It must be number!");
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

    /*@Override
    public void onTemperatureConverted(double convertedTemperature) {
        label2.setText(Double.toString(convertedTemperature));
    } */

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

