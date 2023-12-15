package Lists.Exercise1;

import java.util.Collections;
import java.util.*;

public class ListName {
    public static List<String> printInitialList(String[] names) {
        List<String> newInitiallist = new ArrayList<>();
        int count = 0;
        Collections.addAll(newInitiallist, names);
        System.out.println("Initial list:");
        for (String name : newInitiallist) {
            count++;
            System.out.println(count + ") " + name);
        }
        return newInitiallist;
    }


    public static void sortAndPrintList(String[] names) {
        List<String> nameList = new ArrayList<>();
        int count = 0;
        Collections.addAll(nameList, names);
        Collections.sort(nameList);
        System.out.println("Sorted list:");
        for (String name : nameList) {
            count++;
            System.out.println(count + ") " + name);

        }

    }
}





/* for (int i = 0; i <= names.length - 1; i++) {
         newInitiallist.add(names[i]);*/

