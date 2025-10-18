//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Engine> engines = new ArrayList<Engine>();
        List<CarModel> modellen = List.of(
                new CarModel("Cabrio", List.of(2, 4), "RWD", false, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline"))),
                new CarModel("Coupe", List.of(2, 5), "RWD", false, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline"))),
                new CarModel("FourByFour", List.of(5, 5), "4x4", true, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline"))),
                new CarModel("Hatchback", List.of(4, 5), "FWD", false, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline"))),
                new CarModel("MPV", List.of(5, 8), "FWD", true, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline"))),
                new CarModel("PickUp", List.of(2, 3), "AWD", true, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline"))),
                new CarModel("Sedan", List.of(2, 5), "RWD", true, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline"))),
                new CarModel("Stationwagon", List.of(2, 5), "AWD", true, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline"))),
                new CarModel("SUV", List.of(5, 7), "AWD", true, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline"))),
                new CarModel("Ute", List.of(2, 3), "FWD", true, List.of(new BurnerEngine("Benzine", 2100, 4, 6, "Manual", "Natural", "Inline")
                        , new BurnerEngine("Diesel", 1900, 4, 5, "Manual", "Turbo", "Inline")))
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat voor auto wilt u hebben? U heeft keuze uit te volgende soorten: ");
        for (CarModel model : modellen) {
            System.out.print(model.getNaam() + " | ");
        }
        System.out.println("\n Kies het bijbehorende getal (1-10) voor de soort auto: ");
        int keuze = scanner.nextInt() - 1;
        System.out.println("Dat model komt met " + modellen.get(keuze).getAandrijving() + " aandrijving.");
        System.out.print("Dat model heeft ");
        System.out.println(modellen.get(keuze).heeftTrekhaak() ? "wel een trekhaak." : "geen trekhaak.");

        System.out.println("En hoeveel zitplaatsen wilt u hebben? U heeft keuze uit: ");
        System.out.println(modellen.get(keuze).getMogelijkeZitplaatsen());
        int aantalZitplaatsen = scanner.nextInt();

//        System.out.println("Dit zijn de motorkeuzes hierbij: Welke wilt u hebben? ");
//        //TODO motor aanmaken van de juiste soort
//        String motor = scanner.nextLine();
//        //TODO motor aanmaken gebaseerd op de requirements
//        System.out.println("Welke Systemen wilt u geintegreerd hebben? ");
//        String systemen = scanner.nextLine();
//        //TODO aanpassen welke systemen er meegenomen moeten worden
//        System.out.println("Wilt u nog accessoires hebben? ");//TODO keuzes uitprinten, met een ja of nee keuze, en zo ja welke dingen
//        String accessoires = scanner.nextLine();

        Car auto = CarFactory.createCar(4, modellen.get(keuze).getNaam(), modellen.get(keuze).getAandrijving(), modellen.get(keuze).heeftTrekhaak(), aantalZitplaatsen);
        if (auto != null) {
            System.out.print("U kiest dus een: " + auto.getClass().getSimpleName() + "! Deze heeft dus: \n" + auto.zitplaatsen + " zitplaatsen, en " + auto.aandrijving + " aandrijving en heeft ");
            if(auto.trekhaak){
                System.out.println("wel een trekhaak.");
            } else {
                System.out.println("geen trekhaak.");
            }
        } else {
            System.out.println("Onbekend type auto.");
        }


    }
}