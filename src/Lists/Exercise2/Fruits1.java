package Lists.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Fruits1 {
    static void printPartOfList2(List<String> list, int startIndex, int endIndex) {
        List<String> partList = list.subList(startIndex, endIndex);
        System.out.println("\nList part:");
        Fruits1.printList(partList);
    }

    static void printInitialList(ArrayList<String> fruitsList) {
        System.out.println("Initial list:");
        Fruits1.printList(fruitsList);
    }

    static void printList(List<String> list) {
        int count = 0;
        for (String name : list) {
            count++;
            System.out.println(count + ") " + name);
        }
    }

}





