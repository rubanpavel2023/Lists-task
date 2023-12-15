package Lists.Exercise3;

import Lists.Exercise2.ListFruits;

import java.util.LinkedList;

import static Lists.Exercise3.ListFruits2.createAndPrintInitialLinkedList;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"orange", "grape", "apple", "lemon"};
        LinkedList<String> initialList = createAndPrintInitialLinkedList(fruits);
        System.out.println();
        ListFruits2.addWords(initialList, "plum", "mango");
    }

}
