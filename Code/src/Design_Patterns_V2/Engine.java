package Design_Patterns_V2;

public abstract class Engine {

    public abstract String print();
}


class CombustionEngine extends Engine {
    public int cilinders;
    public int engineSize;
    public String configuration;
    public int power;
    public CombustionEngine(int cilinders, int engineSize, String configuration, int power) {
        this.cilinders = cilinders;
        this.engineSize = engineSize;
        this.configuration = configuration;
        this.power = power;
    }

    public void start() {
        System.out.println("Combustion Engine started");
    }
    public String print(){
        return "combustion engine: " + this.engineSize + " cc " + this.configuration + this.cilinders + " " + this.power + " pk";
    }
}

 class ElectricEngine extends Engine {
    int power;
    public ElectricEngine(int power){
        this.power = power;
    }
    public void start() {
        System.out.println("Electric Engine started");
    }
    public String print(){
        return "Electric Engine " + this.power;
    }
}
