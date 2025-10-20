public class CarFactory extends Car{
    public static Car createCar(int wielen, String type, String aandrijving, boolean trekhaak, int zitplaatsen, Engine engine) {
        return switch (type.toLowerCase()) {
            case "cabrio" -> new Cabrio(wielen, aandrijving, trekhaak, zitplaatsen, "hardtop", engine);
            case "fourbyfour" -> new FourByFour(wielen, aandrijving, trekhaak, zitplaatsen, engine);
            case "hatchback" -> new Hatchback(wielen, aandrijving, trekhaak, zitplaatsen, engine);
            case "mpv" -> new MPV(wielen, aandrijving, trekhaak, zitplaatsen, engine);
            case "coupe" -> new Coupe(wielen, aandrijving, trekhaak, zitplaatsen, engine);
            case "pick-up" -> new PickUp(wielen, aandrijving, trekhaak, zitplaatsen, engine);
            case "sedan" -> new Sedan(wielen, aandrijving, trekhaak, zitplaatsen, engine);
            case "stationwagon" -> new Stationwagon(wielen, aandrijving, trekhaak, zitplaatsen, engine);
            case "suv" -> new SUV(wielen, aandrijving, trekhaak, zitplaatsen, engine);
            case "ute" -> new Ute(wielen, aandrijving, trekhaak, zitplaatsen, engine);
            default -> null;
        };
    }
}
