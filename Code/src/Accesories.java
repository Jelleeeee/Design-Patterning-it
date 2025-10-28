public class Accesories {
    public boolean spoiler;
    public boolean rims;
    public boolean wrap;
    public boolean lining;
    public boolean varnish;
    public boolean tune;
    public boolean tints;
    public boolean roofRack;
    public boolean rollcage;

    public String printAccesories(){
        return "spoiler, rims, wrap, lining, varnish, tune, tints, roof rack\n";
    }
    public Accesories(boolean[] accesoires) {
        this.spoiler = accesoires[0];
        this.rims = accesoires[1];
        this.wrap = accesoires[2];
        this.lining = accesoires[3];
        this.varnish = accesoires[4];
        this.tune = accesoires[5];
        this.tints = accesoires[6];
        this.rollcage = accesoires[7];
    }

    public String print(){
        String gekozen = "";
            if(spoiler){
                gekozen += "spoiler";
            }
            if(rims){
                gekozen += " rims";
            }
            if(wrap){
                gekozen += " wrap";
            }
            if(lining){
                gekozen += " lining";
            }
            if (varnish) {
                gekozen += " varnish";
            }
            if (tune) {
                gekozen += " tune";
            }
            if (tints) {
                gekozen += " tints";
            }
            if (rollcage) {
                gekozen += " rollcage";
            }
            return gekozen + "\n";
        }
}

