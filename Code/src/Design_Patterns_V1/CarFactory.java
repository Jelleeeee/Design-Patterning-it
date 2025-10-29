package Design_Patterns_V1;

import Design_Patterns_V1.Accesories;

public class CarFactory extends Car{
    public static Car createCar(int wielen, String type, String aandrijving, boolean trekhaak, int zitplaatsen, Engine engine, Systems system, Accesories accesories) {
        return switch (type.toLowerCase()) {
            case "cabrio" -> new Cabrio(wielen, aandrijving, trekhaak, zitplaatsen, "hardtop", engine, system, accesories);
            case "fourbyfour" -> new FourByFour(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            case "hatchback" -> new Hatchback(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            case "mpv" -> new MPV(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            case "coupe" -> new Coupe(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            case "pick-up" -> new PickUp(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            case "sedan" -> new Sedan(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            case "stationwagon" -> new Stationwagon(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            case "suv" -> new SUV(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            case "ute" -> new Ute(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            default -> null;
        };
    }
}