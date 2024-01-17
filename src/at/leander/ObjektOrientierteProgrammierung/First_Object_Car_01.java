package at.leander.ObjektOrientierteProgrammierung;

public class First_Object_Car_01 {

    public static void main(String[] args) {

        Tank tank = new Tank(8, 94);


        Engine engine = new Engine(150, Engine.TYPE.DIESEL, tank);

        printTankEngineDetails(tank, engine);

        Wheels w1 = new Wheels(215, 65, Wheels.TYPE.WINTERWHEEL);
        Wheels w2 = new Wheels(215, 65, Wheels.TYPE.WINTERWHEEL);
        Wheels w3 = new Wheels(215, 65, Wheels.TYPE.WINTERWHEEL);
        Wheels w4 = new Wheels(215, 65, Wheels.TYPE.WINTERWHEEL);

        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(100,-40);
        Car c1 = new Car("Audi", "1234A", "green", engine, tank);
        printCarDetails(c1);

        printTankEngineDetails(tank, engine);

        c1.addWheel(w1);
        c1.addWheel(w2);
        c1.addWheel(w3);
        c1.addWheel(w4);

        c1.addMirror(r1);
        c1.addMirror(r2);

        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println();
        System.out.println(c1.getWheels().get(0).getWheelType());
        System.out.println();

        Car c2 = new Car("Mercedes", "223A", "yellow", engine, tank);
        printCarDetails(c2);

        printTankEngineDetails(tank, engine);


        Car c3 = new Car("Toyota", "1234A", "black", engine, tank);
        printCarDetails(c3);

        printTankEngineDetails(tank, engine);


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


    public static void printTankEngineDetails(Tank tank, Engine engine) {
        System.out.println("Fuel Consumption: " + tank.getFuelConsumption());
        System.out.println("Remaining gasoline: " + tank.getFuelAmount());
        System.out.println("Remaining range: " + tank.getRemainingRange());
        tank.turboBoost();
        engine.drive(70);
        System.out.println("Remaining gasoline: " + tank.getFuelAmount());
        System.out.println("Horsepower: " + engine.getHorsePower());
        System.out.println("Gas Type: " + engine.getGasType());
        engine.drive(70);

    }
}
