package com.company.console;


import javax.swing.*;

public class Tree {
    private Node rootNode;

    public Tree() {
        rootNode = null;
    }

    public void insertNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true)
            {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null) {
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }


    public static void printBinaryTree(Node root, int level) {
        if (root == null)
            return;
        printBinaryTree(root.getRightChild(), level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|---" + root.getValue());
        } else
            System.out.println(root.getValue());
        printBinaryTree(root.getLeftChild(), level + 1);
    }

    public void displayTree(Node root, JTextArea textArea, int level) {
        if (root == null)
            return;
        displayTree(root.getRightChild(), textArea, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                textArea.append("|\t");
            textArea.append("|------------------" + root.getValue() + "\n");
        } else
            textArea.append(root.getValue() + "\n");
        displayTree(root.getLeftChild(), textArea, level + 1);
    }

    public void addArray(int[] array) {
        for (int value : array) {
            insertNode(value);
        }
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }
}