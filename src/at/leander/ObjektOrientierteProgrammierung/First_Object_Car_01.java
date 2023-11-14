package at.leander.ObjektOrientierteProgrammierung;

public class First_Object_Car_01 {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Mercedes";
        c1.fuelConsumption = 7;
        c1.serialNumber = "ABCD123";
        c1.color = "black";

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelConsumption = 6;
        c2.serialNumber = "1234AB";
        c2.color = "blue";

        printCarDetails(c1);
        printCarDetails(c2);
    }

    public static void printCarDetails(Car car) {
        System.out.println("Serial Number: " + car.serialNumber);
        System.out.println("Brand: " + car.brand);
        System.out.println("Fuel Consumption: " + car.fuelConsumption);
        System.out.println("Color: " + car.color);
        System.out.println();
    }
}
