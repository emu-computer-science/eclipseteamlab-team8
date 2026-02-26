package eclipseproject;

public class RunIntegerSets {

    public static void main(String[] args) {


        SetOfIntegers set = new SetOfIntegers();
        CollectionSetsOfIntegers collection = new CollectionSetsOfIntegers();
        UserInteraction ui = new UserInteraction();
        OrganizationIntegers org = new OrganizationIntegers();

       
        set.addElements();

        ui.values();
        ui.handleShow();
        ui.handleRestore();
        ui.printPrompt();
        ui.handleReverse();
        ui.handleRandomize();
        ui.handleHelp();
        ui.handleQuit();

        org.increase();
        org.decrease();
        org.random();

        System.out.println("Program ran successfully");
    }
}