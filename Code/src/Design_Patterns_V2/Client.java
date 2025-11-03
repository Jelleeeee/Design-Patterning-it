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

    public Car configureCar() {
        chooseCar();

        CarType[] carOptions = CarType.values();
        Car baseCar = switch (chosenCarType) {
            case Cabrio -> new Cabrio(4, "RWD", false, 2, new CombustionEngine(4, 1900, "I", 190));
            case Suv -> new SUV(4, "AWD", true, 5, new ElectricEngine(1000));
            case FourbyFour -> new FourByFour(4, "4WD", true, 5, new CombustionEngine(6, 6000, "V", 560));
            case Sedan -> new Sedan(4, "FWD", false, 5, new CombustionEngine(6, 5198, "F", 796));
        };

        // Wrap keuze
        System.out.print("Do you want a wrap on your chosen car? (Y/N): ");
        String wrapChoice = scanner.nextLine();
        if (wrapChoice.equalsIgnoreCase("y")) {
            System.out.print("What colour? ");
            String color = scanner.nextLine();
            baseCar = new WrapDecorator(baseCar, color);
        }

        // Sportpakket keuze
        System.out.print("Do you want to add our sport package? (Y/N): ");
        String sportChoice = scanner.nextLine();
        if (sportChoice.equalsIgnoreCase("y")) {
            baseCar = new SportDecorator(baseCar);
        }
        return baseCar;
    }

    private void chooseCar() {
        System.out.println("What type of car are you looking for?");
        CarType[] carOptions = CarType.values();
        for (int i = 0; i < carOptions.length; i++) {
            System.out.println((i + 1) + ". " + carOptions[i].name());
        }

        int choice = 0;
        while (choice < 1 || choice > carOptions.length) {
            System.out.print("Enter a number between 1 and " + carOptions.length + ": ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Not a correct number, please try again.");
            }
        }
        chosenCarType = carOptions[choice - 1];
    }
}
