public class CarFactory extends Car{
    public static Car createCar(int wielen, String type, String aandrijving, boolean trekhaak, int zitplaatsen) {
        return switch (type.toLowerCase()) {
            case "cabrio" -> new Cabrio(wielen, aandrijving, trekhaak, zitplaatsen, "hardtop");
            case "fourbyfour" -> new FourByFour(wielen, aandrijving, trekhaak, zitplaatsen);
            case "hatchback" -> new Hatchback(wielen, aandrijving, trekhaak, zitplaatsen);
            case "mpv" -> new MPV(wielen, aandrijving, trekhaak, zitplaatsen);
            case "coupe" -> new Coupe(wielen, aandrijving, trekhaak, zitplaatsen);
            case "pick-up" -> new PickUp(wielen, aandrijving, trekhaak, zitplaatsen);
            case "sedan" -> new Sedan(wielen, aandrijving, trekhaak, zitplaatsen);
            case "stationwagon" -> new Stationwagon(wielen, aandrijving, trekhaak, zitplaatsen);
            case "suv" -> new SUV(wielen, aandrijving, trekhaak, zitplaatsen);
            case "ute" -> new Ute(wielen, aandrijving, trekhaak, zitplaatsen);
            default -> null;
        };
    }
}
