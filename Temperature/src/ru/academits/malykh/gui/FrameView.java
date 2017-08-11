package ru.academits.malykh.gui;

import ru.academits.malykh.common.TemperatureConverter;
import ru.academits.malykh.common.View;
import ru.academits.malykh.common.ViewListener;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class FrameView implements View {
    private final ArrayList<ViewListener> listeners = new ArrayList<>();
    private ArrayList<TemperatureConverter> list = new ArrayList<>();
    private final JFrame frame = new JFrame("Temperature converter");
    private final JButton convertButton = new JButton("Convert");
    private final JTextField entryTextField = new JTextField(10);
    private final JLabel entryField = new JLabel("Enter temperature: ");
    private final JLabel resultLabel = new JLabel();
    private final JComboBox<String> comboBox = new JComboBox<>();

    private void createFrame() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400, 200));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createContent() {
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = c1.gridy = 0;
        c1.gridwidth = 2;
        c1.gridheight = 1;
        c1.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c1.insets = new Insets(-90, 5, -40, 5);
        panel.add(entryField, c1);

        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = 0;
        c2.gridy = 1;
        c2.gridwidth = 2;
        c2.gridheight = 1;
        c2.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.weightx = 1.0;
        c2.insets = new Insets(-110, 5, -40, 5);
        panel.add(entryTextField, c2);

        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 0;
        c3.gridy = 1;
        c3.gridwidth = 2;
        c3.gridheight = 1;
        c3.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c3.weightx = 1.0;
        c3.insets = new Insets(-50, 5, -40, 5);
        panel.add(convertButton, c3);

        GridBagConstraints c4 = new GridBagConstraints();

        c4.gridx = 0;
        c4.gridy = 1;
        c4.gridwidth = 2;
        c4.gridheight = 1;
        c4.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c4.weightx = 1.0;
        c4.insets = new Insets(90, 5, -40, 5);
        panel.add(comboBox, c4);

        GridBagConstraints c5 = new GridBagConstraints();
        c5.gridx = 0;
        c5.gridy = 1;
        c5.gridwidth = 2;
        c5.gridheight = 1;
        c5.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c5.weightx = 1.0;
        c5.insets = new Insets(10, 5, -40, 5);
        panel.add(resultLabel, c5);

        frame.setContentPane(panel);
    }

    private void initEvents() {
        convertButton.addActionListener(e -> {
            try {
                double temperature = Double.parseDouble(entryTextField.getText());
                resultLabel.setForeground(Color.BLACK);

                for (ViewListener listener : listeners) {
                    listener.convertTemperature(temperature);
                }

                for (TemperatureConverter t : list) {
                    if (comboBox.getSelectedItem() == t.toString()) {
                        if (t.toString().contains("To")) {
                            resultLabel.setText(String.valueOf(t.convertToCelsius(temperature)));
                        }
                        if (t.toString().contains("From")) {
                            resultLabel.setText(String.valueOf(t.convertFromCelsius(temperature)));
                        }
                    }
                }

            } catch (NumberFormatException ex) {
                resultLabel.setForeground(Color.RED);
                resultLabel.setText("It must be number!");
            }
        });
    }

    @Override
    public void startApplication() {
        SwingUtilities.invokeLater(() -> {
            createContent();
            createFrame();
            initEvents();
        });
    }

    @Override
    public void onTemperatureConverted(double convertedTemperature) {
        resultLabel.setText(Double.toString(convertedTemperature));
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
    public void addTemperatureConverter(TemperatureConverter converter) {

        list.add(converter);
        comboBox.addItem(converter.toString());
    }

    @Override
    public void close() throws Exception {
        frame.setVisible(false);
    }
}

