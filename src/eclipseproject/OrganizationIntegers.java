package eclipseproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

public class OrganizationIntegers {

    public void increase(ArrayList<Integer>list) {
        Collections.sort(list);
        for(int i :list) {
        	System.out.print(i+"");
        }
    }

    public void decrease() {
        System.out.println("decrease not implemented");
    }

    public void random() {
        System.out.println("random not implemented");
    }
}