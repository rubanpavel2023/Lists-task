package Lists.Exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("orange");
        fruitsList.add("mango");
        fruitsList.add("banana");
        fruitsList.add("apple");
        fruitsList.add("kiwi");
        fruitsList.add("cherry");

        Fruits1.printInitialList(fruitsList);
        Fruits1.printPartOfList2(fruitsList, 1, 3);
    }

}
