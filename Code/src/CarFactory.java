public class CarFactory extends Car{
    public static Car createCar(int wielen, String type, String aandrijving, boolean trekhaak, int zitplaatsen, Engine engine, Systems system) {
        return switch (type.toLowerCase()) {
            case "cabrio" -> new Cabrio(wielen, aandrijving, trekhaak, zitplaatsen, "hardtop", engine, system);
            case "fourbyfour" -> new FourByFour(wielen, aandrijving, trekhaak, zitplaatsen, engine, system);
            case "hatchback" -> new Hatchback(wielen, aandrijving, trekhaak, zitplaatsen, engine, system);
            case "mpv" -> new MPV(wielen, aandrijving, trekhaak, zitplaatsen, engine, system);
            case "coupe" -> new Coupe(wielen, aandrijving, trekhaak, zitplaatsen, engine, system);
            case "pick-up" -> new PickUp(wielen, aandrijving, trekhaak, zitplaatsen, engine, system);
            case "sedan" -> new Sedan(wielen, aandrijving, trekhaak, zitplaatsen, engine, system);
            case "stationwagon" -> new Stationwagon(wielen, aandrijving, trekhaak, zitplaatsen, engine, system);
            case "suv" -> new SUV(wielen, aandrijving, trekhaak, zitplaatsen, engine, system);
            case "ute" -> new Ute(wielen, aandrijving, trekhaak, zitplaatsen, engine, system);
            default -> null;
        };
    }
}
