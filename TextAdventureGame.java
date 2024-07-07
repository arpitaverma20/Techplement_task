import java.util.Scanner;
public class TextAdventureGame {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious forest.");

        System.out.println("Options:");
        System.out.println("1. Explore the forest");
        System.out.println("2. Stay where you are");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            exploreForest(scanner);
        } else {
            System.out.println("You decide to stay where you are. The adventure ends.");
        }

        scanner.close();
    }

    public static void exploreForest(Scanner scanner) {
        System.out.println("As you explore the forest, you encounter a fork in the path.");

        System.out.println("Options:");
        System.out.println("1. Take the left path");
        System.out.println("2. Take the right path");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            leftPath(scanner);
        } else {
            rightPath(scanner);
        }
    }

    public static void leftPath(Scanner scanner) {
        System.out.println("You take the left path and find a hidden cave.");

        System.out.println("Options:");
        System.out.println("1. Enter the cave");
        System.out.println("2. Continue exploring the forest");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            enterCave(scanner);
        } else {
            System.out.println("You decide to continue exploring the forest.");
            System.out.println("You find a magical fountain. The adventure ends.");
        }
    }

    public static void rightPath(Scanner scanner) {
        System.out.println("You take the right path and encounter a group of friendly animals.");

        System.out.println("Options:");
        System.out.println("1. Play with the animals");
        System.out.println("2. Ignore the animals and keep moving");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("You have a great time playing with the animals. The adventure ends.");
        } else {
            System.out.println("You decide to ignore the animals and keep moving.");
            System.out.println("You discover a hidden treasure. Congratulations, you've completed the adventure!");
        }
    }

    public static void enterCave(Scanner scanner) {
        System.out.println("You enter the dark cave and encounter a mysterious creature.");

        System.out.println("Options:");
        System.out.println("1. Try to communicate with the creature");
        System.out.println("2. Retreat from the cave");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("The creature responds positively. It guides you to a secret exit. Congratulations, you've completed the adventure!");
        } else {
            System.out.println("You decide to retreat from the cave. The adventure ends.");
        }
    }

    public static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = 0;
        do {
            System.out.print("Enter your choice (1-" + maxChoice + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > maxChoice);

        return choice;
    }

    public static void main(String[] args)

          StartGame();

}


