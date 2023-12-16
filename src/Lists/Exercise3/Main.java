package Lists.Exercise3;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        LinkedList<String> namesList = new LinkedList<>();
        namesList.add("orange");
        namesList.add("grape");
        namesList.add("apple");
        namesList.add("lemon");

        Fruits2.printInitialList(namesList);
        Fruits2.addWords(namesList, "plum", "mango");

    }


}
