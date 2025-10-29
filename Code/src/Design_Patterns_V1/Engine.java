package Design_Patterns_V1;

public abstract class Engine {
    public int power;

    public Engine(int power) {
        this.power = power;
    }

    public abstract void start();
    public abstract String printEngine();
}
