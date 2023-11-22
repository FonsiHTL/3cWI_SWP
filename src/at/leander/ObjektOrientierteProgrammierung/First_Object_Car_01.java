package at.leander.ObjektOrientierteProgrammierung;

public class First_Object_Car_01 {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Mercedes";
        c1.fuelConsumption = 7;
        c1.serialNumber = "ABCD123";
        c1.color = "black";
        c1.fuelAmount = 60;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelConsumption = 6;
        c2.serialNumber = "1234AB";
        c2.color = "blue";
        c2.fuelAmount = 56;

        printCarDetails(c1);
        printCarDetails(c2);


    }



    public static void printCarDetails(Car car) {


        System.out.println("Serial Number: " + car.serialNumber);
        System.out.println("Brand: " + car.brand);
        System.out.println("Fuel Consumption: " + car.fuelConsumption);
        System.out.println("Color: " + car.color);
        System.out.println("Remaining gasoline: " + car.fuelAmount);
        car.drive();
        System.out.println("Remaining gasoline: " + car.fuelAmount);
        car.break1();
        System.out.println();
        car.turboBoost();
        car.honk(4);
        System.out.println("Remaining range: " + car.getRemainingRange());
        System.out.println();
        System.out.println();
    }
}
