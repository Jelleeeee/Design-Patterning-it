package Design_Patterns_V2;

class Dealership {
    private SellCommunication strategy;
    public Dealership(SellCommunication strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(SellCommunication strategy) {
        this.strategy = strategy;
    }
    public void sellCar(Car car) {
        //System.out.println("Selling car via " + strategy.getClass().getSimpleName());
        System.out.println("Final configuration: " + car.print() + " via sellcommunication: " + strategy.getClass().getSimpleName());
        strategy.sell(car);
    }
}