package Design_Patterns_V2;

public class Telephone  implements SellCommunication{
    public void sell(Car car) {
        System.out.println("Selling car by telephone: " + car.getClass().getSimpleName());
    }
}
