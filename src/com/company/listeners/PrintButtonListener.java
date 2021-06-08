package com.company.listeners;

import com.company.ArrayUtils;
import com.company.SwingUtils;
import com.company.console.Tree;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintButtonListener implements ActionListener {

    JTextArea printTreeTextArea;
    JTextField elementsTextField;
    Tree tree;

    public PrintButtonListener(JTextArea printTreeTextArea, JTextField elementsTextField, Tree tree) {
        this.printTreeTextArea = printTreeTextArea;
        this.elementsTextField = elementsTextField;
        this.tree = tree;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        printTreeTextArea.setText(null);
        tree.setRootNode(null);
        int[] array;
        try {
            array = ArrayUtils.toIntArray(elementsTextField.getText());
            tree.addArray(array);
            tree.displayTree(tree.getRootNode(), printTreeTextArea, 0);
        } catch (Exception exception) {
            SwingUtils.showInfoMessageBox("Bad value", "Error");
        }
    }
}
