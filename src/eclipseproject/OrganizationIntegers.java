package eclipseproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrganizationIntegers {


    public int insertionSort(ArrayList<Integer> list) {

        int swaps = 0;

        for (int i = 1; i < list.size(); i++) {

            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {

                list.set(j + 1, list.get(j));
                j--;
                swaps++;

            }

            list.set(j + 1, key);
        }

        return swaps;
    }

    public void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public void randomize(ArrayList<Integer> list) {

        Random r = new Random();

        for (int i = 0; i < list.size(); i++) {

            int a = r.nextInt(list.size());
            int b = r.nextInt(list.size());

            int temp = list.get(a);
            list.set(a, list.get(b));
            list.set(b, temp);
        }
    }
}