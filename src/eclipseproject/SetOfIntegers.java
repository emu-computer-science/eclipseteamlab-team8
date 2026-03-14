package eclipseproject;

import java.util.ArrayList;

public class SetOfIntegers {

    ArrayList<Integer> elements;
    String state;

    public SetOfIntegers(ArrayList<Integer> nums) {
        elements = new ArrayList<>(nums);
        state = "random";
    }

    public String toString() {
        return "[" + state + "] " + elements;
    }
}