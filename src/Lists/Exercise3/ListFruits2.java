package Lists.Exercise3;

import java.util.Collections;
import java.util.LinkedList;

public class ListFruits2 {
    public static LinkedList<String> createAndPrintInitialLinkedList(String[] fruits) {
        LinkedList<String> newInitialList = new LinkedList<>();
        int count = 0;
        Collections.addAll(newInitialList, fruits);
        System.out.println("Initial list:");
        for (String fruit : newInitialList) {
            count++;
            System.out.println(count + ") " + fruit);
        }
        return newInitialList;
    }


    public static LinkedList<String> addWords(LinkedList<String> wordsList, String wordToStart, String wordToLast) {
        LinkedList<String> newList = new LinkedList<>(wordsList);
        newList.addFirst(wordToStart);
        newList.add(wordToLast);
        System.out.println("Edited list:");
        int count = 0;
        for (String word : newList) {
            count++;
            System.out.println(count + ") " + word);
        }
        return newList;
    }


}
