package at.leander.ObjektOrientierteProgrammierung;

public class First_Object_Car_01 {

    public static void main(String[] args) {

        Tank tank = new Tank(8, 94);
        printTankDetails(tank);

        Engine engine = new Engine(150, Engine.TYPE.DIESEL, tank);
        printEngineDetails(engine);

        Car c1 = new Car("Audi", "1234A", "green", engine);
        printCarDetails(c1);


        Car c2 = new Car("Mercedes", "223A", "yellow", engine);
        printCarDetails(c2);


        Car c3 = new Car("Toyota", "1234A", "black", engine);
        printCarDetails(c3);


    }


    public static void printCarDetails(Car car) {


        System.out.println("Serial Number: " + car.getSerialNumber());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Color: " + car.getColor());

        car.break1();
        System.out.println();
        car.honk(4);
        System.out.println();
        System.out.println();
    }

    public static void printEngineDetails(Engine engine) {
        System.out.println("Horsepower: " + engine.getHorsePower());
        System.out.println("Gas Type: " + engine.getGasType());
        engine.drive();

    }

    public static void printTankDetails(Tank tank) {
        System.out.println("Fuel Consumption: " + tank.getFuelConsumption());
        System.out.println("Remaining gasoline: " + tank.getFuelAmount());
        System.out.println("Remaining range: " + tank.getRemainingRange());
        tank.turboBoost();

    }
}
