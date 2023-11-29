package at.leander.ObjektOrientierteProgrammierung;

public class First_Object_Car_01 {

    public static void main(String[] args) {


        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("1234A");
        c1.setColor("black");
        c1.setFuelAmount(70);


        printCarDetails(c1);
        /*
        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelConsumption = 6;
        c2.serialNumber = "1234AB";
        c2.color = "blue";
        c2.fuelAmount = 56;



        printCarDetails(c2);



        Car c3 = new Car( 10, "Toyota", "1234A", 90, "Black");



        printCarDetails(c3);

         */
    }



    public static void printCarDetails(Car car) {


        System.out.println("Serial Number: " + car.getSerialNumber());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Fuel Consumption: " + car.getFuelConsumption());
        System.out.println("Color: " + car.getColor());
        System.out.println("Remaining gasoline: " + car.getFuelAmount());
        car.drive();
        System.out.println("Remaining gasoline: " + car.getFuelAmount());
        car.break1();
        System.out.println();
        car.turboBoost();
        car.honk(4);
        System.out.println("Remaining range: " + car.getRemainingRange());
        System.out.println();
        System.out.println();
    }
}
