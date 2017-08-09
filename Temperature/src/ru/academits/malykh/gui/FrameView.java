package ru.academits.malykh.gui;

import ru.academits.malykh.common.TemperatureConverter;
import ru.academits.malykh.common.View;
import ru.academits.malykh.common.ViewListener;
import ru.academits.malykh.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class FrameView implements View {
    private final ArrayList<ViewListener> listeners = new ArrayList<>();
    private HashMap<String, String> map = new HashMap<>();
    private final JFrame frame = new JFrame("Temperature converter");
    private final JButton button = new JButton("Convert");
    private final JTextField textField = new JTextField(10);
    private final JLabel label1 = new JLabel("Enter temperature: ");
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
        panel.add(label1, c1);

        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = 0;
        c2.gridy = 1;
        c2.gridwidth = 2;
        c2.gridheight = 1;
        c2.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c2.fill = GridBagConstraints.HORIZONTAL;
        c2.weightx = 1.0;
        c2.insets = new Insets(-110, 5, -40, 5);
        panel.add(textField, c2);

        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 0;
        c3.gridy = 1;
        c3.gridwidth = 2;
        c3.gridheight = 1;
        c3.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c3.weightx = 1.0;
        c3.insets = new Insets(-50, 5, -40, 5);
        panel.add(button, c3);

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
        button.addActionListener(e -> {
            try {
                double temperature = Double.parseDouble(textField.getText());
                resultLabel.setForeground(Color.BLACK);

                for (ViewListener listener : listeners) {
                    listener.convertTemperature(temperature);
                }

                if (comboBox.getSelectedItem() == "FromCelsiusToKelvin") {
                    resultLabel.setText(String.valueOf(new ConvertToKelvin("FromCelsiusToKelvin").convertToCelsius(temperature)));

                } else if (comboBox.getSelectedItem() == "FromKelvinToCelsius") {
                    resultLabel.setText(String.valueOf(new ConvertToKelvin("FromKelvinToCelsius").convertFromCelsius(temperature)));

                } else if (comboBox.getSelectedItem() == "FromCelsiusToFahrenheit") {
                    resultLabel.setText(String.valueOf(new ConvertToFahrenheit("FromCelsiusToFahrenheit").convertToCelsius(temperature)));

                } else if (comboBox.getSelectedItem() == "FromFahrenheitToCelsius") {
                    resultLabel.setText(String.valueOf(new ConvertToFahrenheit("FromFahrenheitToCelsius").convertFromCelsius(temperature)));

                } else if (comboBox.getSelectedItem() == "FromKelvinToFahrenheit") {

                    resultLabel.setText(String.valueOf(new ConvertToFahrenheit("FromCelsiusToFahrenheit").convertToCelsius(
                            new ConvertToKelvin("FromKelvinToCelsius").convertFromCelsius(temperature))));

                } else if (comboBox.getSelectedItem() == "FromFahrenheitToKelvin") {

                    resultLabel.setText(String.valueOf(new ConvertToKelvin("FromCelsiusToKelvin").convertToCelsius(
                            new ConvertToFahrenheit("FromFahrenheitToCelsius").convertFromCelsius(temperature))));
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
    public void addTemperatureConverter(TemperatureConverter converter, String key) {

        map.put("FromCelsiusToKelvin", ConvertToKelvin.class.getSimpleName());
        map.put("FromKelvinToCelsius", ConvertToKelvin.class.getSimpleName());
        map.put("FromCelsiusToFahrenheit", ConvertToFahrenheit.class.getSimpleName());
        map.put("FromFahrenheitToCelsius", ConvertToFahrenheit.class.getSimpleName());
        map.put("FromKelvinToFahrenheit", ConvertToKelvin.class.getSimpleName());
        map.put("FromFahrenheitToKelvin", ConvertToKelvin.class.getSimpleName());


        Optional<String> result = map.entrySet()
                .stream()
                .filter(entry -> converter.getClass().getSimpleName().equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        if (result.isPresent()) {
            comboBox.addItem(key);
        }

        if (!map.keySet().contains(key)) {
            JOptionPane.showMessageDialog(null, "The Program has an invalid key! Check the keys!",
                    "Warning!", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void close() throws Exception {
        frame.setVisible(false);
    }
}

