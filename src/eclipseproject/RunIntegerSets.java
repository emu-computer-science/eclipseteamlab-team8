package eclipseproject;

import java.util.*;

public class RunIntegerSets {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        CollectionSetsOfIntegers collection = new CollectionSetsOfIntegers();

        UserInteraction ui = new UserInteraction(collection);

        boolean running = true;

        while (running) {

            ui.printPrompt();

            String cmd = sc.nextLine();

            switch (cmd) {

                case "show": ui.show(); break;
                case "new": ui.create(); break;
                case "select": ui.select(); break;
                case "delete": ui.delete(); break;
                case "sort": ui.sort(); break;
                case "reverse": ui.reverse(); break;
                case "randomize": ui.randomize(); break;
                case "save": ui.save(); break;
                case "restore": ui.restore(); break;
                case "help": ui.help(); break;

                case "quit":
                    System.out.println("Thank you");
                    running = false;
                    break;

                default:
                    System.out.println("Unknown command.");
                    ui.help();
            }
        }
    }
}