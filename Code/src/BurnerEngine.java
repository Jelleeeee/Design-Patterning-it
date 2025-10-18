public class BurnerEngine extends Engine{
    String fuel;
    int EngineCapacity;
    int Cilinders;
    int gears;
    String transmission;
    String Aspiration;
    String MotorType;

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

    @Override
    public void start(){
            System.out.println("BurnerEngine gestart (" + power + "  pk).");
        }
}
