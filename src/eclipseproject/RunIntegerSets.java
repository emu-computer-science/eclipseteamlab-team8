package eclipseproject;

import java.util.*;

public class RunIntegerSets {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	ArrayList<ArrayList<Integer>> sets = new ArrayList<>();
    	int current = -1;
    	
    	while(true) {

    System.out.print("Select command: (new, show, select, delete, quit): ");
    	String command = scanner.nextLine();

    		  	if (command.equals("new")) {

    		  	System.out.println("Enter integers:");
    		  	String[] nums = scanner.nextLine().split(" ");

    		  	ArrayList<Integer> set = new ArrayList<>();

    		     for (String n : nums) {
    		    	 set.add(Integer.parseInt(n));
    		                }

    		         sets.add(set);

    		         char label = (char)('A' + sets.size() - 1);
    		         System.out.println("Set " + label + " created: " + set);
    		            }

    		            else if (command.equals("show")) {

    		                if (sets.size() == 0) {
    		                    System.out.println("No sets created.");
    		                }

    		                for (int i = 0; i < sets.size(); i++) {

    		                    char label = (char)('A' + i);

    		                    if (i == current) {
    		                        System.out.println("*" + label + ": " + sets.get(i));
    		                    } else {
    		                        System.out.println(label + ": " + sets.get(i));
    		                    }
    		                }
    		            }

    		            else if (command.equals("select")) {

    		                System.out.print("Enter set letter: ");
    		                char letter = scanner.nextLine().charAt(0);

    		                current = letter - 'A';

    		                System.out.println("Set " + letter + " selected.");
    		            }

    		            else if (command.equals("delete")) {

    		                if (current == -1) {
    		                    System.out.println("No set selected.");
    		                } else {
    		                    sets.remove(current);
    		                    current = -1;
    		                    System.out.println("Set deleted.");
    		                }
    		            }

    		            else if (command.equals("quit")) {
    		                break;
    		            }
    		        }
    		    }
    		}