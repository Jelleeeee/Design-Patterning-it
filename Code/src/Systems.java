public class Systems {
    public boolean parkassist;
    public boolean ABS;
    public boolean TCS;
    public boolean ISA;
    public boolean laneAssist;
    public boolean startStop;
    public boolean cruiseControl;
    public boolean ACC;
    public boolean AEB;

    public Systems(boolean[] systemen) {
        this.parkassist = systemen[0];
        this.ABS = systemen[1];
        this.TCS = systemen[2];
        this.ISA = systemen[3];
        this.laneAssist = systemen[4];
        this.startStop = systemen[5];
        this.cruiseControl = systemen[6];
        this.ACC = systemen[7];
        this.AEB = systemen[8];
    }

    public String printSystems(){
        return "Parkassist, ABS, TCS, ISA, laneAssist, startStop, cruiseControl, ACC, AEB\n";
    }
    public String printGekozenSystemen(){
        String gekozen = "";
        if(parkassist){
            gekozen += "Parkassist";
        }
        if(ABS){
            gekozen += " ABS";
        }
        if(TCS){
            gekozen += " TCS";
        }
        if(ISA){
            gekozen += " ISA";
        }
        if (laneAssist) {
            gekozen += " LaneAssist\n";
        }
        if (startStop) {
            gekozen += " StartStop\n";
        }
        if (cruiseControl) {
            gekozen += " CruiseControl\n";
        }
        if (ACC) {
            gekozen += " ACC\n";
        }
        if (AEB) {
            gekozen += " AEB\n";
        }
        return gekozen;
    }
}
