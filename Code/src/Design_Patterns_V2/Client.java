package Design_Patterns_V2;

import java.util.Scanner;

public class Client {
    private CarType chosenCarType;
    private final Scanner scanner = new Scanner(System.in);
    private final SellCommunication sellCommunication;

    public Client(SellCommunication sellCommunication) {
        this.sellCommunication = sellCommunication;
    }

    public SellCommunication getSellCommunication() {
        return sellCommunication;
    }

    public void chooseCar() {
        System.out.println("What kind of car would you like to purchase?");
        System.out.println("You can choose out of the following types:");

        // Toon de lijst met auto-opties
        CarType[] carOptions = CarType.values();
        for (int i = 0; i < carOptions.length; i++) {
            System.out.println((i + 1) + ". " + carOptions[i].name());
        }
        // Vraag om input
        int choice = 0;
        while (choice < 1 || choice > carOptions.length) {
            System.out.print("Enter a number between 1 and " + carOptions.length + ": ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            }
        }
        chosenCarType = carOptions[choice - 1];
        System.out.println("You chose: " + chosenCarType.name());
    }
    public CarType getChosenCarType() {
        return chosenCarType;
    }


}
