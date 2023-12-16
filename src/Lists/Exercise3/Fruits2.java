package Lists.Exercise3;

import java.util.LinkedList;
import java.util.List;

public class Fruits2 {

    static void printInitialList(LinkedList<String> list) {
        System.out.println("Initial list:");
        printList(list);
    }

    static void addWords(LinkedList<String> wordsList, String wordToStart, String wordToLast) {
        System.out.println("\nEdited list:");
        wordsList.addFirst(wordToStart);
        wordsList.add(wordToLast);
        printList(wordsList);
    }

    static void printList(List<String> list) {
        int count = 0;
        for (String name : list) {
            count++;
            System.out.println(count + ") " + name);
        }
    }

}
