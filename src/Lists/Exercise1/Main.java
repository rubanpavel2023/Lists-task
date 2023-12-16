package Lists.Exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Alice");
        namesList.add("Robert");
        namesList.add("Lisa");
        namesList.add("David");
        namesList.add("Amanda");

        Names.printInitialList(namesList);
        Names.sortAndPrintList(namesList);
    }
}
