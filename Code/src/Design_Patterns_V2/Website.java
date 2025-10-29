package Design_Patterns_V2;

public class Website  implements SellCommunication{
        public void sell(Car car) {
            System.out.println("Selling car via website: " + car.getClass().getSimpleName());
        }
}
