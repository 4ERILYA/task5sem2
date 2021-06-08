package com.company.gui;

import com.company.console.Tree;
import com.company.listeners.PrintButtonListener;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JTextField elementsTextField;
    private JButton printButton;
    private JTextArea printTreeTextArea;

    public MainFrame() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        Tree tree = new Tree();
        printButton.addActionListener(new PrintButtonListener(printTreeTextArea, elementsTextField, tree));

    }
}
