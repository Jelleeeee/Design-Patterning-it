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

    public Systems(boolean parkassist, boolean ABS, boolean TCS, boolean ISA, boolean laneAssist, boolean startStop, boolean cruiseControl, boolean ACC, boolean AEB) {
        this.parkassist = parkassist;
        this.ABS = ABS;
        this.TCS = TCS;
        this.ISA = ISA;
        this.laneAssist = laneAssist;
        this.startStop = startStop;
        this.cruiseControl = cruiseControl;
        this.ACC = ACC;
        this.AEB = AEB;
    }

    public String printSystems(){
        return "Parkassist, ABS, TCS, ISA, laneAssist, startStop, cruiseControl, ACC, AEB\n";
    }
}
