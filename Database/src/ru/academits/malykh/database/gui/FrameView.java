package ru.academits.malykh.database.gui;

import ru.academits.malykh.database.common.View;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class FrameView implements View {
    private JFrame frame = new JFrame("Application");
    private JButton buttonUpdate = new JButton("Update");
    private JButton buttonRemove = new JButton("Remove");
    private JButton buttonInsert = new JButton("Insert");
    private JButton buttonShow = new JButton("Show");

    private JPanel panel = new JPanel(new GridBagLayout());

    private JLabel labelName = new JLabel("Name");
    private JLabel labelAge = new JLabel("Age");
    private JLabel labelProfession = new JLabel("Profession");

    private JTextField textFieldName = new JTextField(10);
    private JTextField textFieldAge = new JTextField(10);
    private JTextField textFieldProfession = new JTextField(10);

    private Connection connection;

    private void createFrame() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400, 300));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();
    }

    private void createContent() {
        GridBagConstraints constraintsButtonUpdate = new GridBagConstraints();
        constraintsButtonUpdate.gridx = 0;
        constraintsButtonUpdate.gridy = 0;
        constraintsButtonUpdate.gridwidth = 2;
        constraintsButtonUpdate.gridheight = 1;
        constraintsButtonUpdate.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsButtonUpdate.weightx = 1.0;
        constraintsButtonUpdate.insets = new Insets(170, 10, -30, 10);
        panel.add(buttonUpdate, constraintsButtonUpdate);

        GridBagConstraints constraintsButtonRemove = new GridBagConstraints();
        constraintsButtonRemove.gridx = 0;
        constraintsButtonRemove.gridy = 0;
        constraintsButtonRemove.gridwidth = 2;
        constraintsButtonRemove.gridheight = 1;
        constraintsButtonRemove.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsButtonRemove.weightx = 1.0;
        constraintsButtonRemove.insets = new Insets(170, 100, -30, 10);
        panel.add(buttonRemove, constraintsButtonRemove);

        GridBagConstraints constraintsButtonInsert = new GridBagConstraints();
        constraintsButtonInsert.gridx = 0;
        constraintsButtonInsert.gridy = 0;
        constraintsButtonInsert.gridwidth = 2;
        constraintsButtonInsert.gridheight = 1;
        constraintsButtonInsert.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsButtonInsert.weightx = 1.0;
        constraintsButtonInsert.insets = new Insets(170, 190, -30, 10);
        panel.add(buttonInsert, constraintsButtonInsert);

        GridBagConstraints constraintsButtonShow = new GridBagConstraints();
        constraintsButtonShow.gridx = 0;
        constraintsButtonShow.gridy = 0;
        constraintsButtonShow.gridwidth = 2;
        constraintsButtonShow.gridheight = 1;
        constraintsButtonShow.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsButtonShow.weightx = 1.0;
        constraintsButtonShow.insets = new Insets(170, 280, -30, 10);
        panel.add(buttonShow, constraintsButtonShow);

        GridBagConstraints constraintsLabelName = new GridBagConstraints();
        constraintsLabelName.gridx = 0;
        constraintsLabelName.gridy = 0;
        constraintsLabelName.gridwidth = 2;
        constraintsLabelName.gridheight = 1;
        constraintsLabelName.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsLabelName.weightx = 1.0;
        constraintsLabelName.insets = new Insets(170, 50, 350, 10);
        panel.add(labelName, constraintsLabelName);

        GridBagConstraints constraintsLabelAge = new GridBagConstraints();
        constraintsLabelAge.gridx = 0;
        constraintsLabelAge.gridy = 0;
        constraintsLabelAge.gridwidth = 2;
        constraintsLabelAge.gridheight = 1;
        constraintsLabelAge.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsLabelAge.weightx = 1.0;
        constraintsLabelAge.insets = new Insets(170, 50, 250, 10);
        panel.add(labelAge, constraintsLabelAge);

        GridBagConstraints constraintsLabelProfession = new GridBagConstraints();
        constraintsLabelProfession.gridx = 0;
        constraintsLabelProfession.gridy = 0;
        constraintsLabelProfession.gridwidth = 2;
        constraintsLabelProfession.gridheight = 1;
        constraintsLabelProfession.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsLabelProfession.weightx = 1.0;
        constraintsLabelProfession.insets = new Insets(170, 50, 150, 10);
        panel.add(labelProfession, constraintsLabelProfession);

        GridBagConstraints constraintsTextFieldName = new GridBagConstraints();
        constraintsTextFieldName.gridx = 0;
        constraintsTextFieldName.gridy = 0;
        constraintsTextFieldName.gridwidth = 2;
        constraintsTextFieldName.gridheight = 1;
        constraintsTextFieldName.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsTextFieldName.fill = GridBagConstraints.HORIZONTAL;
        constraintsTextFieldName.weightx = 1.0;
        constraintsTextFieldName.insets = new Insets(170, 150, 350, 10);
        panel.add(textFieldName, constraintsTextFieldName);

        GridBagConstraints constraintsTextFieldAge = new GridBagConstraints();
        constraintsTextFieldAge.gridx = 0;
        constraintsTextFieldAge.gridy = 0;
        constraintsTextFieldAge.gridwidth = 2;
        constraintsTextFieldAge.gridheight = 1;
        constraintsTextFieldAge.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsTextFieldAge.fill = GridBagConstraints.HORIZONTAL;
        constraintsTextFieldAge.weightx = 1.0;
        constraintsTextFieldAge.insets = new Insets(170, 150, 250, 10);
        panel.add(textFieldAge, constraintsTextFieldAge);

        GridBagConstraints constraintsTextFieldProfession = new GridBagConstraints();
        constraintsTextFieldProfession.gridx = 0;
        constraintsTextFieldProfession.gridy = 0;
        constraintsTextFieldProfession.gridwidth = 2;
        constraintsTextFieldProfession.gridheight = 1;
        constraintsTextFieldProfession.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
        constraintsTextFieldProfession.fill = GridBagConstraints.HORIZONTAL;
        constraintsTextFieldProfession.weightx = 1.0;
        constraintsTextFieldProfession.insets = new Insets(170, 150, 150, 10);
        panel.add(textFieldProfession, constraintsTextFieldProfession);

        frame.setContentPane(panel);
    }

    private void statement(String string) {
        try {
            connection.prepareStatement(string).executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DB_login;integratedSecurity=true;");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
    }

    private void initEvents() {
        buttonInsert.addActionListener(e -> { //sqljdbc_auth.dll вставить в jre/bin + подключить sqljdbc.jar ctrl+alt+shift+s

            String insert = "INSERT INTO Table_2(name, age, profession) VALUES " +
                    "('" + textFieldName.getText() + "', '" + textFieldAge.getText() + "', '" + textFieldProfession.getText() + "')";
            getConnection();
            statement(insert);
        });

        buttonRemove.addActionListener(e -> {
            String remove = "DELETE FROM Table_2 WHERE age='" + textFieldAge.getText() + "'";
            getConnection();
            statement(remove);
        });

        buttonShow.addActionListener(e -> {
            try {
                String show = "SELECT * FROM Table_2";
                PreparedStatement statement = connection.prepareStatement(show);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                        System.out.printf("%2s %2d %2s \n", resultSet.getString("name"), resultSet.getInt("age"),
                                resultSet.getString("profession"));
                    }
                } catch(SQLException e1){
                    e1.printStackTrace();
                }

        });
    }

    @Override
    public void startApplication() {
        createFrame();
        createContent();
        initEvents();
    }
}
