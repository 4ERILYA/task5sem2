package com.company.console;


import com.company.ArrayUtils;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        String numLine = ArrayUtils.readRow("Enter tree's value --> ");
        int[] numbers;
        numbers = ArrayUtils.toIntArray(numLine);
        tree.addArray(numbers);
        tree.printBinaryTree( tree.getRootNode(), 0);
    }
}