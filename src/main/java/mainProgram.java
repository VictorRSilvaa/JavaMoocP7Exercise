import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Database db = new Database();

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Quit") || command.equals("quit")) {
                break;
            } else if (command.equals("Observation") || command.equals("observation")) {
                addObservationCommand(scan, db);
            } else if (command.equals("All") || command.equals("all")) {
                printAllCommand(db);
            } else if (command.equals("Add") || command.equals("add")) {
                addCommand(scan, db);
            } else if (command.equals("One") || command.equals("one")) {
                printOneBirdCommand(scan, db);
            }
        }
    }

    public static void addCommand(Scanner scan, Database db) {
        System.out.println("Name:");
        String name = scan.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scan.nextLine();
        Bird bird = new Bird(name, latinName);
        db.add(bird);
    }

    public static void addObservationCommand(Scanner scan, Database db) {
        System.out.println("Bird?");
        String name = scan.nextLine();
        db.addObservation(name);
    }

    public static void printAllCommand(Database db) {
        db.printAllBirds();
    }

    public static void printOneBirdCommand(Scanner scan, Database db) {
        System.out.println("Bird?");
        String name = scan.nextLine();
        db.printOneBird(name);
    }
}
