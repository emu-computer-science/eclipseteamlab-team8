package eclipseproject;

import java.util.ArrayList;

public class CollectionSetsOfIntegers {

    ArrayList<SetOfIntegers> sets = new ArrayList<>();

    public void addSet(SetOfIntegers s) {
        sets.add(s);
    }

    public void removeSet(int index) {
        sets.remove(index);
    }

    public SetOfIntegers getSet(int index) {
        return sets.get(index);
    }

    public int size() {
        return sets.size();
    }
}