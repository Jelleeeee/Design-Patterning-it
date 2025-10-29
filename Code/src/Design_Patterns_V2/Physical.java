package Design_Patterns_V2;

public class Physical implements SellCommunication{
    public void sell(Car car) {
        System.out.println("Selling car in person: " + car.getClass().getSimpleName());
    }
}
