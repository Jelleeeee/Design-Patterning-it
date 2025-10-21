public class BurnerEngine extends Engine{
    public String fuel;
    public int EngineCapacity;
    public int Cilinders;
    public int gears;
    public String transmission;
    public String Aspiration;
    public String MotorType;

    public BurnerEngine(int power, String Fuel, int EngineCapacity, int Cilinders, int gears, String transmission, String Aspiration, String MotorType)
    {   
        super(power);
        this.fuel = Fuel;
        this.EngineCapacity = EngineCapacity;
        this.Cilinders = Cilinders;
        this.gears = gears;
        this.transmission = transmission;
        this.Aspiration = Aspiration;
        this.MotorType = MotorType;
    }

    public String printEngine(){
        return "een " + this.EngineCapacity +  "cc " + this.Aspiration + " " + this.MotorType + " " + this.Cilinders + " met een " + this.transmission + " tranmissie, met " + this.gears +  " versnellingen met " +  this.fuel + " brandstof \n";
    }

    @Override
    public void start(){
            System.out.println("BurnerEngine gestart (" + power + "  pk).");
        }
}
