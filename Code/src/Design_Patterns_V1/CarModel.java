package Design_Patterns_V1;

import java.util.List;

public class CarModel {
    private final String naam;
    private final List<Integer> mogelijkeZitplaatsen;
    private final String aandrijving;
    private final boolean trekhaak;
    private final List<Engine> mogelijkeMotoren;

    public CarModel(String naam, List<Integer> zitplaatsen, String aandrijving, boolean trekhaak, List<Engine> motoren) {
        this.naam = naam;
        this.mogelijkeZitplaatsen = zitplaatsen;
        this.aandrijving = aandrijving;
        this.trekhaak = trekhaak;
        this.mogelijkeMotoren = motoren;
    }

    public String getNaam() { return naam; }
    public List<Integer> getMogelijkeZitplaatsen() { return mogelijkeZitplaatsen; }
    public String getAandrijving() { return aandrijving; }
    public boolean heeftTrekhaak() { return trekhaak; }
    public String getMogelijkeMotoren() {
        String info = " ";
        for (Engine engine : mogelijkeMotoren) {
            info += engine.printEngine();
        }
        return info;
    }
    public Engine getKeuzeMotor(int keuze) { return mogelijkeMotoren.get(keuze); }
}
