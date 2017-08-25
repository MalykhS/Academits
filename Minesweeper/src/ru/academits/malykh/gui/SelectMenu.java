package ru.academits.malykh.gui;

import ru.academits.malykh.common.View;

import javax.swing.*;
import java.awt.*;

public class SelectMenu implements View {
    private final JFrame frame = new JFrame();
    private final JButton go = new JButton("GO");

    private final JRadioButton easyLevel = new JRadioButton("Easy level");
    private final JRadioButton mediumLevel = new JRadioButton("Medium level");
    private final JRadioButton hardLevel = new JRadioButton("Hard level");

    private final JLabel height = new JLabel("Height");
    private final JLabel width = new JLabel("Width");
    private final JLabel mines = new JLabel("Mines");

    private final JLabel easyLevelHeightCount = new JLabel("9");
    private final JLabel mediumLevelHeightCount = new JLabel("16");
    private final JLabel hardLevelHeightCount = new JLabel("16");

    private final JLabel easyLevelWidthCount = new JLabel("9");
    private final JLabel mediumLevelWidthCount = new JLabel("16");
    private final JLabel hardLevelWidthCount = new JLabel("30");

    private final JLabel easyLevelMinesCount = new JLabel("10");
    private final JLabel mediumLevelMinesCount = new JLabel("40");
    private final JLabel hardLevelMinesCount = new JLabel("99");

    @Override
    public void createFrame() {
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(450, 250));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void createContent() {
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = c1.gridy = 0;
        c1.gridwidth = 2;
        c1.gridheight = 1;
        c1.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c1.insets = new Insets(-80, -20, 0, 0);
        panel.add(easyLevel, c1);

        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = c2.gridy = 0;
        c2.gridwidth = 2;
        c2.gridheight = 1;
        c2.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c2.insets = new Insets(10, -20, 0, 0);
        panel.add(mediumLevel, c2);

        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = c3.gridy = 0;
        c3.gridwidth = 2;
        c3.gridheight = 1;
        c3.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c3.insets = new Insets(100, -20, 0, 0);
        panel.add(hardLevel, c3);


        GridBagConstraints c7 = new GridBagConstraints();
        c7.gridx = c7.gridy = 0;
        c7.gridwidth = 2;
        c7.gridheight = 1;
        c7.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c7.insets = new Insets(-140, 150, 0, 0);
        panel.add(height, c7);

        GridBagConstraints c8 = new GridBagConstraints();
        c8.gridx = c8.gridy = 0;
        c8.gridwidth = 2;
        c8.gridheight = 1;
        c8.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c8.insets = new Insets(-140, 250, 0, 0);
        panel.add(width, c8);

        GridBagConstraints c9 = new GridBagConstraints();
        c9.gridx = c9.gridy = 0;
        c9.gridwidth = 2;
        c9.gridheight = 1;
        c9.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c9.insets = new Insets(-140, 350, 0, 0);
        panel.add(mines, c9);

        GridBagConstraints c10 = new GridBagConstraints();
        c10.gridx = c10.gridy = 0;
        c10.gridwidth = 2;
        c10.gridheight = 1;
        c10.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c10.insets = new Insets(-80, 150, 0, 0);
        panel.add(easyLevelHeightCount, c10);

        GridBagConstraints c11 = new GridBagConstraints();
        c11.gridx = c11.gridy = 0;
        c11.gridwidth = 2;
        c11.gridheight = 1;
        c11.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c11.insets = new Insets(10, 150, 0, 0);
        panel.add(mediumLevelHeightCount, c11);

        GridBagConstraints c12 = new GridBagConstraints();
        c12.gridx = c12.gridy = 0;
        c12.gridwidth = 2;
        c12.gridheight = 1;
        c12.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c12.insets = new Insets(100, 150, 0, 0);
        panel.add(hardLevelHeightCount, c12);

        GridBagConstraints c13 = new GridBagConstraints();
        c13.gridx = c13.gridy = 0;
        c13.gridwidth = 2;
        c13.gridheight = 1;
        c13.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c13.insets = new Insets(-80, 250, 0, 0);
        panel.add(easyLevelWidthCount, c13);

        GridBagConstraints c14 = new GridBagConstraints();
        c14.gridx = c14.gridy = 0;
        c14.gridwidth = 2;
        c14.gridheight = 1;
        c14.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c14.insets = new Insets(10, 250, 0, 0);
        panel.add(mediumLevelWidthCount, c14);

        GridBagConstraints c15 = new GridBagConstraints();
        c15.gridx = c15.gridy = 0;
        c15.gridwidth = 2;
        c15.gridheight = 1;
        c15.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c15.insets = new Insets(100, 250, 0, 0);
        panel.add(hardLevelWidthCount, c15);

        GridBagConstraints c16 = new GridBagConstraints();
        c16.gridx = c16.gridy = 0;
        c16.gridwidth = 2;
        c16.gridheight = 1;
        c16.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c16.insets = new Insets(-80, 350, 0, 0);
        panel.add(easyLevelMinesCount, c16);

        GridBagConstraints c17 = new GridBagConstraints();
        c17.gridx = c17.gridy = 0;
        c17.gridwidth = 2;
        c17.gridheight = 1;
        c17.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c17.insets = new Insets(10, 350, 0, 0);
        panel.add(mediumLevelMinesCount, c17);

        GridBagConstraints c18 = new GridBagConstraints();
        c18.gridx = c18.gridy = 0;
        c18.gridwidth = 2;
        c18.gridheight = 1;
        c18.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c18.insets = new Insets(100, 350, 0, 0);
        panel.add(hardLevelMinesCount, c18);

        GridBagConstraints c19 = new GridBagConstraints();
        c19.gridx = c19.gridy = 0;
        c19.gridwidth = 2;
        c19.gridheight = 1;
        c19.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        c19.insets = new Insets(170, 150, 0, 0);
        panel.add(go, c19);

        ButtonGroup group = new ButtonGroup();
        group.add(easyLevel);
        group.add(mediumLevel);
        group.add(hardLevel);

        frame.setContentPane(panel);
        frame.pack();

        go.addActionListener(e -> {
            if (easyLevel.isSelected()) {
                EasyLevel easyLevel = new EasyLevel();
                easyLevel.createFrame();
                easyLevel.createContent();
            }
            if (mediumLevel.isSelected()) {
                MediumLevel mediumLevel = new MediumLevel();
                mediumLevel.createFrame();
                mediumLevel.createContent();
            }
            if (hardLevel.isSelected()) {
                HardLevel hardLevel = new HardLevel();
                hardLevel.createFrame();
                hardLevel.createContent();
            }
        });
    }
}
