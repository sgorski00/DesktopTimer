package pl.sgorski.ui;

import javax.swing.*;
import java.awt.*;

public class LoginScreen {
    private final JFrame mainFrame = new JFrame();
    private final JTextField loginField = new JTextField();
    private final JTextField passwordField = new JTextField();
    private final GridLayout gridLayout = new GridLayout(7, 1);
    private final FlowLayout bottomPanel = new FlowLayout();
    private final JButton loginButton = new JButton();
    private final JButton exitButton = new JButton();

    private final Dimension textFieldDim = new Dimension(50, 100);

    public void frame() {
        loginField.setPreferredSize(textFieldDim);
        passwordField.setPreferredSize(textFieldDim);

        bottomPanel.addLayoutComponent("exit", exitButton);
        bottomPanel.addLayoutComponent("login", loginButton);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setPreferredSize(new Dimension(250, 250));
        mainFrame.setMinimumSize(new Dimension(250, 250));
        mainFrame.setResizable(false);
        mainFrame.setLayout(gridLayout);
        mainFrame.getContentPane().add(new JLabel("Wybierz świat:"));
        mainFrame.getContentPane().add(new JOptionPane());
        mainFrame.getContentPane().add(new JLabel("Login:"));
        mainFrame.getContentPane().add(loginField);
        mainFrame.getContentPane().add(new JLabel("Password:"));
        mainFrame.getContentPane().add(passwordField);
        mainFrame.getContentPane().add(bottomPanel);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
