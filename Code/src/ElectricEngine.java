public class ElectricEngine extends Engine{
    public int BatteryContent;

    public ElectricEngine(int power, int BatteryContent) {
        super(power);
        this.BatteryContent = BatteryContent;
    }

    @Override
    public void start() {
        System.out.println("ElectricEngine gestart (" + power + " pk," + BatteryContent + " kwh).");
    }

    @Override
    public String printEngine() {
        return this.BatteryContent + " kwh" + this.power;
    }
}
