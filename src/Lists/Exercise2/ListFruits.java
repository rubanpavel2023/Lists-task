package Lists.Exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFruits {
    public static List<String> createAndPrintInitialArrayList(String[] fruits) {
        List<String> newInitiallist = new ArrayList<>();
        int count = 0;
        Collections.addAll(newInitiallist, fruits);
        System.out.println("Initial list:");
        for (String fruit : newInitiallist) {
            count++;
            System.out.println(count + ") " + fruit);
        }
        return newInitiallist;
    }


    public static void createAndPrintPartArrayList(String[] fruits) {
        List<String> newPartlist = new ArrayList<>();
        int count = 0;
        int startIndex = 1, endIndex = 3;
        Collections.addAll(newPartlist, fruits);
        System.out.println("Part list:");
        for (String fruit : newPartlist.subList(startIndex, endIndex)) {
            count++;
            System.out.println(count + ") " + fruit);

        }
    }
}




