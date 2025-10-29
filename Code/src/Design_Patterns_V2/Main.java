package Design_Patterns_V2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        Client client = new Client(new Website());

        System.out.print("Welcome to our Autistic car dealership. ");

        client.chooseCar();

        CarType type = client.getChosenCarType();
        dealership.setStrategy(client.getSellCommunication());

        Car car = switch (type) {
            case Cabrio -> new Cabrio(4, "RWD", true, 5, (new CombustionEngine()));
            case Suv -> new SUV(4, "RWD", true, 5, (new ElectricEngine()));
            case FourbyFour -> new FourByFour(4, "RWD", true, 5, (new CombustionEngine()));
            case Sedan -> new Sedan(4, "RWD", true, 5, (new CombustionEngine()));
        };
        dealership.sellCar(car);
    }
}
