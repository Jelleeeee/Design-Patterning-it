package Design_Patterns_V2;

public abstract class CarDecorator extends Car{
    public Car decoratedCar;
    public Engine engine;

    public CarDecorator(Car decoratedCar) {
        super(decoratedCar.wielen, decoratedCar.aandrijving,
                decoratedCar.trekhaak, decoratedCar.zitplaatsen, decoratedCar.engine);
        this.decoratedCar = decoratedCar;
    }
    public abstract String print();
}


class SportDecorator extends CarDecorator {
    public boolean sportPackage;
    public SportDecorator(Car decoratedCar) {
        super(decoratedCar);
        this.sportPackage = true;
    }
    @Override
    public String print() {
        return decoratedCar.print() + " and the Sport Package";
    }
}

class WrapDecorator extends CarDecorator {
    String color;
    public WrapDecorator(Car decoratedCar, String color) {
        super(decoratedCar);
        this.color = color;
    }
    @Override
    public String print() {
        return decoratedCar.print() +" with a "+ color + " wrap" ;
    }
}