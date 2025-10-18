public abstract class Car {
    int wielen;
    String aandrijving;
    boolean trekhaak;
    int zitplaatsen;

    public static class Cabrio extends Car{
        String dakMateriaal;
        public Cabrio(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen, String dakMateriaal){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
            this.dakMateriaal = dakMateriaal;
        }
    }

    public static class FourByFour extends Car{
        public FourByFour(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
        }
    }

    public static class Coupe extends Car{
        public Coupe(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
        }
    }

    public static class MPV extends Car{
        public MPV(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
        }
    }

    public static class Hatchback extends Car{
        public Hatchback(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
        }
    }

    public static class PickUp extends Car{
        public PickUp(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
        }
    }

    public static class Sedan extends Car{
        public Sedan(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
        }
    }

    public static class SUV extends Car{
        public SUV(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
        }
    }

    public static class Ute extends Car{
        public Ute(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
        }
    }

    public static class Stationwagon extends Car{
        public Stationwagon(int wielen, String aandrijving, boolean trekhaak, int zitplaatsen){
            this.wielen = wielen;
            this.aandrijving = aandrijving;
            this.trekhaak = trekhaak;
            this.zitplaatsen = zitplaatsen;
        }
    }
}
