package Design_Patterns_V1;

import Design_Patterns_V1.Accesories;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Engine> engines = new ArrayList<Engine>();
        List<CarModel> modellen = List.of(
    new CarModel("Cabrio", List.of(2, 5), "RWD", false, List.of(
            new BurnerEngine(180, "Benzine", 2100, 4, 6, "automatische", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(160, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    )),
    new CarModel("Coupe", List.of(2, 5), "RWD", false, List.of(
            new BurnerEngine(190, "Benzine", 2100, 4, 6, "handgeschakeld", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(170, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    )),
    new CarModel("FourByFour", List.of(5, 5), "4x4", true, List.of(
            new BurnerEngine(200, "Benzine", 2100, 4, 6, "handgeschakeld", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(180, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    )),
    new CarModel("Hatchback", List.of(4, 5), "FWD", false, List.of(
            new BurnerEngine(150, "Benzine", 2100, 4, 6, "automatische", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(130, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    )),
    new CarModel("MPV", List.of(5, 8), "FWD", true, List.of(
            new BurnerEngine(160, "Benzine", 2100, 4, 6, "handgeschakeld", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(140, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    )),
    new CarModel("PickUp", List.of(2, 3), "AWD", true, List.of(
            new BurnerEngine(210, "Benzine", 2100, 4, 6, "handgeschakeld", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(190, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    )),
    new CarModel("Sedan", List.of(2, 5), "RWD", true, List.of(
            new BurnerEngine(170, "Benzine", 2100, 4, 6, "handgeschakeld", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(150, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    )),
    new CarModel("Stationwagon", List.of(2, 5), "AWD", true, List.of(
            new BurnerEngine(175, "Benzine", 2100, 4, 6, "automatische", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(155, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    )),
    new CarModel("SUV", List.of(5, 7), "AWD", true, List.of(
            new BurnerEngine(220, "Benzine", 2100, 4, 6, "automatische", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(200, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    )),
    new CarModel("Ute", List.of(2, 3), "FWD", true, List.of(
            new BurnerEngine(180, "Benzine", 2100, 4, 6, "handgeschakeld", "atmosferisch aangezogen", "Inline"),
            new BurnerEngine(160, "Diesel", 1900, 4, 5, "handgeschakeld", "turbocharged", "Inline")
    ))
);
        Scanner scanner = new Scanner(System.in);

        //vragen en uitprinten welke auto te klant wilt hebben
        System.out.println("Wat voor auto wilt u hebben? U heeft keuze uit te volgende soorten: ");
        for (CarModel model : modellen) {
            System.out.print(model.getNaam() + " | ");
        }

        //Bijbehorende getal aangeven en opnemen van de klant
        System.out.println("\n Kies het bijbehorende getal (1-10) voor de soort auto: ");
        int keuze = scanner.nextInt() - 1;
        while (keuze < 0 || keuze > 9) {
            System.out.println("kies AUB een geldig getal");
            keuze = scanner.nextInt() - 1;
        }

        System.out.println("Dat model komt met " + modellen.get(keuze).getAandrijving() + " aandrijving.");
        System.out.print("Dat model heeft ");
        System.out.println(modellen.get(keuze).heeftTrekhaak() ? "wel een trekhaak." : "geen trekhaak.");

        System.out.println("En hoeveel zitplaatsen wilt u hebben? U heeft keuze uit: ");
        System.out.println(modellen.get(keuze).getMogelijkeZitplaatsen());
        int aantalZitplaatsen = scanner.nextInt();

        System.out.println("Dit zijn de motorkeuzes hierbij: Welke wilt u hebben? (kies het bijbehorende getal)");
        System.out.println(modellen.get(keuze).getMogelijkeMotoren());
        int motorKeuze = scanner.nextInt() - 1;
        boolean[] pepe = new boolean[9];
        Systems test = new Systems(pepe);
        System.out.println("Welke Systemen wilt u geintegreerd hebben? U heeft keuze uit: ");
        System.out.println(test.printSystems());

        String temp = " ";
        int[] systeemkeuzes = new int[9];
        int loop = 0;
        do{
            temp = scanner.nextLine();
            try{
                systeemkeuzes[loop] = Integer.parseInt(temp);
            } catch(NumberFormatException _){loop--;}
            loop++;
        } while(!(Objects.equals(temp, "stop")));

        boolean[] systemen = new boolean[9];
        for (int i = 0; i < loop; i++) {
            systemen[systeemkeuzes[i] - 1] = true;
        }
        Systems system = new Systems(systemen);
        System.out.println(system.printGekozenSystemen());

        boolean[] ac = new boolean[8];
        Accesories Accessoirestest = new Accesories(ac);
        System.out.println("Welke accessoires wilt u hebben? U heeft keuze uit: ");
        System.out.println(Accessoirestest.printAccesories());
        loop = 0;
        int[] Accesoirekeuzes = new int[8];
        do{
            temp = scanner.nextLine();
            try{
                Accesoirekeuzes[loop] = Integer.parseInt(temp);
            } catch(NumberFormatException _){loop--;}
            loop++;
        } while(!(Objects.equals(temp, "stop")));

        boolean[] accesoires = new boolean[8];
        for (int i = 0; i < loop; i++) {
            accesoires[Accesoirekeuzes[i] - 1] = true;
        }

        Accesories accesories = new Accesories(accesoires);
        System.out.println(accesories.print());

        Car auto = CarFactory.createCar(4, modellen.get(keuze).getNaam(), modellen.get(keuze).getAandrijving(), modellen.get(keuze).heeftTrekhaak(), aantalZitplaatsen, modellen.get(keuze).getKeuzeMotor(motorKeuze), system, accesories);
        if (auto != null) {
            System.out.print("U kiest dus een: " + auto.getClass().getSimpleName() + "! Deze heeft dus: \n" + auto.zitplaatsen + " zitplaatsen, en " + auto.aandrijving + " aandrijving en heeft ");
            if(auto.trekhaak){
                System.out.println("wel een trekhaak.");
            } else {
                System.out.println("geen trekhaak.");
            }
            System.out.println("En deze heeft u met " +  modellen.get(keuze).getKeuzeMotor(motorKeuze).printEngine());
        } else {
            System.out.println("Onbekend type auto.");
        }
    }
}