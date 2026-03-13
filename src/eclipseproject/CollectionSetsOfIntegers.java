package eclipseproject;

import java.util.ArrayList;

public class CollectionSetsOfIntegers {
	SetOfIntegers setOfIntegers = new SetOfIntegers();

    public CollectionSetsOfIntegers() {
        System.out.println("Collection created");
    }

    public void addToList(int element ,ArrayList<Integer> list) {
      list.add(setOfIntegers.addElements(element));
    }
}