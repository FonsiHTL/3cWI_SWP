package at.leander.ObjektOrientierteProgrammierung;

public class First_Object_Car_01 {

    public static void main(String[] args) {


        Car c1 = new Car(8, "Audi", "1234A", 85, "green");
        printCarDetails(c1);


        Car c2 = new Car(7, "Mercedes", "223A", 70, "yellow");
        printCarDetails(c2);


        Car c3 = new Car( 10, "Toyota", "1234A", 90, "black");
        printCarDetails(c3);


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
