public class BurnerEngine extends Engine{
    String fuel;
    int EngineCapacity;
    int Cilinders;
    int gears;
    String transmission;
    String Aspiration;
    String MotorType;

    public BurnerEngine(String Fuel, int EngineCapacity, int Cilinders, int gears, String transmission, String Aspiration, String MotorType)
    {
        this.fuel = Fuel;
        this.EngineCapacity = EngineCapacity;
        this.Cilinders = Cilinders;
        this.gears = gears;
        this.transmission = transmission;
        this.Aspiration = Aspiration;
        this.MotorType = MotorType;
    }
    public void start(){
            System.out.println("BurnerEngine gestart.");
        }
}
