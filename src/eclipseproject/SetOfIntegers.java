package eclipseproject;

import java.util.ArrayList;

public class SetOfIntegers {
	
	ArrayList<Integer> elements;
	String state;
	
    public SetOfIntegers(ArrayList<Integer> numbers) {
    	elements = new ArrayList<>(numbers);
    	state = "random" ;
    }

    public String toString() {
    	return "[" + state + "] " + elements;
   
    }
}