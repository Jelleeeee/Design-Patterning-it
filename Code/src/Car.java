public abstract class Car {

    // 🧱 Gemeenschappelijke velden
    protected final int wielen;
    protected final String aandrijving;
    protected final boolean trekhaak;
    protected final int zitplaatsen;
    protected final Engine engine;
    protected final Systems system;
    protected final Accesories accesories;

    public Car(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                  Engine engine, Systems system, Accesories accesories) {
        this.wielen = wielen;
        this.aandrijving = aandrijving;
        this.trekhaak = trekhaak;
        this.zitplaatsen = zitplaatsen;
        this.engine = engine;
        this.system = system;
        this.accesories = accesories;
    }

    public static class Cabrio extends Car {
        private final String dakMateriaal;
        public Cabrio(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                      String dakMateriaal, Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
            this.dakMateriaal = dakMateriaal;
        }

        public String getDakMateriaal() { return dakMateriaal; }
    }

    public static class FourByFour extends Car {
        public FourByFour(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                          Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
        }
    }

    public static class Coupe extends Car {
        public Coupe(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                     Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
        }
    }

    public static class MPV extends Car {
        public MPV(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                   Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
        }
    }

    public static class Hatchback extends Car {
        public Hatchback(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                         Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
        }
    }

    public static class PickUp extends Car {
        public PickUp(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                      Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
        }
    }

    public static class Sedan extends Car {
        public Sedan(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                     Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
        }
    }

    public static class SUV extends Car {
        public SUV(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                   Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
        }
    }

    public static class Ute extends Car {
        public Ute(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                   Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
        }
    }

    public static class Stationwagon extends Car {
        public Stationwagon(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen,
                            Engine engine, Systems system, Accesories accesories) {
            super(wielen, aandrijving, trekhaak, zitplaatsen, engine, system, accesories);
        }
    }
}
