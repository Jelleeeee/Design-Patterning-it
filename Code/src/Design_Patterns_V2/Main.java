package Design_Patterns_V2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership(new Physical());
        Client client = new Client(new Website());

        System.out.println("Welcome to the Autistic Car Dealership!");

        //  Klant geeft aan welke communicatiemethode er gebruikt word
        dealership.setStrategy(client.getSellCommunication());

        //  Klant kiest en configureert auto
        Car configuredCar = client.configureCar();

        //  Verkoop de uiteindelijke auto
        dealership.sellCar(configuredCar);
    }
}

