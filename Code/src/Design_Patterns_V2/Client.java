package Design_Patterns_V2;

import java.util.Scanner;

public class Client {
    private CarType chosenCarType;
    private EngineType engineType;
    private final Scanner scanner = new Scanner(System.in);
    private SellCommunication sellCommunication;

    public Client(SellCommunication sellCommunication) {
        this.sellCommunication = sellCommunication;
    }

    public SellCommunication getSellCommunication() {
        int keuze = chooseCommunication();
        if (keuze == 1){
            sellCommunication = new Website();
        }
        else if (keuze == 2){
            sellCommunication = new Telephone();
        }
        else if (keuze == 3){
            sellCommunication = new Physical();
        }
        return sellCommunication;
    }

    public Car configureCar() {
        scanner.reset();
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
        boolean end = true;
        while(end) {
            if (wrapChoice.equalsIgnoreCase("y")) {
                System.out.print("What style and colour? ");
                String color = scanner.nextLine();
                baseCar = new WrapDecorator(baseCar, color);
                end = false;
            } else if (wrapChoice.equalsIgnoreCase("n")) {end = false;}
            else {
                System.out.println("Invalid choice, please enter Y or N");
                wrapChoice = scanner.nextLine();
            }
        }

        // Sportpakket keuze
        System.out.print("Do you want to add our sport package? (Y/N): ");
        String sportChoice = scanner.nextLine();
        boolean end2 = true;
        while (end2) {
            if (sportChoice.equalsIgnoreCase("y")) {
                baseCar = new SportDecorator(baseCar);
                end2 = false;
            }
            else if (sportChoice.equalsIgnoreCase("n")) {end2 = false;}
            else {
                System.out.println("Invalid choice, please enter Y or N");
                sportChoice = scanner.nextLine();
            }
        }
        return baseCar;
    }

    private void chooseCar() {
        System.out.println("What type of car are you looking for?");
        CarType[] carOptions = CarType.values();
        EngineType[] engineOptions = EngineType.values();
        for (int i = 0; i < carOptions.length; i++) {
            System.out.println((i + 1) + ". " + carOptions[i].name() + " with a " +engineOptions[i].name().toLowerCase() + " engine.");
        }
        int choice = 0;
        while (choice < 1 || choice > carOptions.length) {
            System.out.print("Enter a number between 1 and " + carOptions.length + ": ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > carOptions.length){
                    System.out.println("Please enter a number between 1 and " + carOptions.length + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a correct number, please try again.");
            }
        }
        chosenCarType = carOptions[choice - 1];
    }

    private int chooseCommunication() {
        System.out.println("How are you communicating with us?");
        System.out.println("Website?(1)" + "\t" + "Telephone(2)" + "\t" + "Physical(3)");
        int keuze = scanner.nextInt();
        scanner.nextLine();
        return keuze;
    }
}
