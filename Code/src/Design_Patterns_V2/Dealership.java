package Design_Patterns_V2;

class Dealership {
    private SellCommunication strategy;
    public Dealership() {
    }
    public void setStrategy(SellCommunication strategy) {
        this.strategy = strategy;
    }
    public void sellCar(Car car) {
        strategy.sell(car);
    }
}