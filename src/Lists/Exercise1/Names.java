package Lists.Exercise1;

import java.util.ArrayList;
import java.util.Collections;


public class Names {

    static void printInitialList(ArrayList<String> list) {
        System.out.println("Initial list:");
        printList(list);
    }

    static void sortAndPrintList(ArrayList<String> list) {
        System.out.println("\nSorted list:");
        Collections.sort(list);
        printList(list);
    }

    static void printList(ArrayList<String> list) {
        int count = 0;
        for (String name : list) {
            count++;
            System.out.println(count + ") " + name);
        }
    }


}

