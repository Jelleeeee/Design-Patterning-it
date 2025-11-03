package Design_Patterns_V2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        Client client = new Client(new Website());

        System.out.println("Welcome to the Autistic Car Dealership!");

        // 1️⃣ Klant kiest en configureert auto
        Car configuredCar = client.configureCar();

        // 2️⃣ Dealer krijgt de communicatiestrategie van de klant
        dealership.setStrategy(client.getSellCommunication());

        // 3️⃣ Verkoop de uiteindelijke auto
        dealership.sellCar(configuredCar);
    }
}

