package at.leander.ObjektOrientierteProgrammierung.at.xxx.examples.cars;

public class Main {

    public static void main(String[] args) {

        Producer producer = new Producer("Germany", "Mercedes", 10);

        Engine engine = new Engine(Engine.TYPE.DIESEL, 250);

        Car c1 = new Car(engine, producer, 50000, "black",300, 7);

        printCarEngineProducerDetails(engine, producer, c1);
    }

    public static void printCarEngineProducerDetails(Engine engine, Producer producer, Car car){
        System.out.println("Producer: " + producer.getProducerName());
        System.out.println("Base Price: " + car.getBasePrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Horse Power: " + engine.getHorsePower());
        System.out.println("Max Speed: " + car.getMaxSpeed());
        System.out.println("Gas Type: " + engine.getGasType());
        System.out.println("Base Fuel Consumption: " + car.getBaseFuelConsumption());
        System.out.println("Producer Country: " + producer.getProducerCountry());
        System.out.println("Producer Discount: " + producer.getProducerDiscount() + "%");
        System.out.println("Real Price: " + car.realPrice() + " Euro");

        System.out.println();

    }
}
