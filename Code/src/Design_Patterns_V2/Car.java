package Design_Patterns_V2;

public abstract class Car {
    int wielen;
    String aandrijving;
    boolean trekhaak;
    int zitplaatsen;
    Engine engine;


    public Car() {
        wielen = 0;
        aandrijving = "";
        trekhaak = false;
        zitplaatsen = 0;
        engine = null;
    }

    public Car(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
               Engine engine) {
        this.wielen = wielen;
        this.aandrijving = aandrijving;
        this.trekhaak = trekhaak;
        this.zitplaatsen = zitplaatsen;
        this.engine = engine;
    }
}

    class Cabrio extends Car {
        public Cabrio(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                      Engine engine) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine);
        }
    }

     class FourByFour extends Car  {
        public FourByFour(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                          Engine engine) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine);
        }
    }

     class SUV extends Car  {
        public SUV(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                     Engine engine) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine);
        }
    }

