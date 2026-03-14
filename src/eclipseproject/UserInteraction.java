package eclipseproject;

import java.io.*;
import java.util.*;

public class UserInteraction {

    CollectionSetsOfIntegers collection;
    OrganizationIntegers org = new OrganizationIntegers();
    Scanner sc = new Scanner(System.in);

    int current = -1;

    public UserInteraction(CollectionSetsOfIntegers c) {
        collection = c;
    }

    public void printPrompt() {
        System.out.println("Commands:new  show  select  delete  sort  reverse  randomize  save  restore  help  quit");
        System.out.print("> ");
    }

    public void show() {

        if (collection.size() == 0) {
            System.out.println("There are no sets.");
            return;
        }

        for (int i = 0; i < collection.size(); i++) {

            char label = (char)('A' + i);

            if (i == current)
                System.out.print("*");
            else
                System.out.print(" ");

            System.out.println(label + ". " + collection.getSet(i));
        }
    }

    public void create() {

        System.out.println("Enter integers:");

        String[] tokens = sc.nextLine().split("\\s+");

        ArrayList<Integer> nums = new ArrayList<>();

        for (String t : tokens)
            if (!t.isEmpty())
                nums.add(Integer.parseInt(t));

        SetOfIntegers set = new SetOfIntegers(nums);

        collection.addSet(set);

        char label = (char)('A' + collection.size() - 1);

        System.out.println("New set " + label + ": " + set);
    }

    public void select() {

        System.out.print("Select set: ");

        char c = sc.nextLine().charAt(0);

        int index = c - 'A';

        if (index >= 0 && index < collection.size()) {

            current = index;

            System.out.println("Current set: " + collection.getSet(index));
        }
        else
            System.out.println("Invalid set.");
    }

    public void delete() {

        if (current == -1) {

            System.out.println("No set selected.");
            return;
        }

        collection.removeSet(current);

        if (current >= collection.size())
            current = -1;

        System.out.println("Set deleted.");
    }

    public void sort() {

        if (current == -1) {

            System.out.println("No set selected.");
            return;
        }

        SetOfIntegers s = collection.getSet(current);

        int swaps = org.insertionSort(s.elements);

        s.state = "increasing";

        System.out.println("Sorted with " + swaps + " swaps: " + s);
    }

    public void reverse() {

        if (current == -1) {

            System.out.println("No set selected.");
            return;
        }

        SetOfIntegers s = collection.getSet(current);

        org.reverse(s.elements);

        if (s.state.equals("increasing"))
            s.state = "decreasing";
        else if (s.state.equals("decreasing"))
            s.state = "increasing";

        System.out.println(s);
    }

    public void randomize() {

        if (current == -1) {

            System.out.println("No set selected.");
            return;
        }

        SetOfIntegers s = collection.getSet(current);

        org.randomize(s.elements);

        s.state = "random";

        System.out.println(s);
    }

    public void save() {

        try {

            System.out.print("Filename: ");
            String name = sc.nextLine();

            PrintWriter out = new PrintWriter(name + ".txt");

            for (SetOfIntegers s : collection.sets) {

                out.println(s.state);

                for (int n : s.elements)
                    out.print(n + " ");

                out.println();
            }

            out.close();

            System.out.println("Saved.");

        }
        catch(Exception e) {

            System.out.println("Save failed.");
        }
    }

    public void restore() {

        try {

            System.out.print("Filename: ");
            String name = sc.nextLine();

            Scanner file = new Scanner(new File(name + ".txt"));

            collection.sets.clear();

            while (file.hasNextLine()) {

                String state = file.nextLine();

                String[] nums = file.nextLine().split(" ");

                ArrayList<Integer> list = new ArrayList<>();

                for (String n : nums)
                    if (!n.isEmpty())
                        list.add(Integer.parseInt(n));

                SetOfIntegers s = new SetOfIntegers(list);
                s.state = state;

                collection.addSet(s);
            }

            file.close();

            System.out.println("Restored.");
        }
        catch(Exception e) {

            System.out.println("Restore failed.");
        }
    }

    public void help() {
        System.out.println("show new select delete sort reverse randomize save restore help quit");
    }
}