package at.leander.ObjektOrientierteProgrammierung.at.xxx.examples.cars;




public class Car {

    private Engine engine;
    private Producer producer;
    private int basePrice;
    private String color;


    private int distanceTraveled;
    private int maxSpeed;
    private int baseFuelConsumption;

    public Car(Engine engine, Producer producer, int basePrice, String color, int maxSpeed, int baseFuelConsumption, int distanceTraveled) {
        this.engine = engine;
        this.producer = producer;
        this.basePrice = basePrice;
        this.distanceTraveled = distanceTraveled;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.baseFuelConsumption = baseFuelConsumption;

    }

    double realPrice() {
        double discountInEuro = basePrice * (producer.producerDiscount / 100);
        return basePrice - discountInEuro;

    }

    public double calculateFuelConsumption() {
        if (distanceTraveled <= 50000) {
            return baseFuelConsumption;
        } else {
            double increasedFuelConsumption = baseFuelConsumption + (baseFuelConsumption* 0.098) ;
            return increasedFuelConsumption;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public Producer getProducer() {
        return producer;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }



    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getBaseFuelConsumption() {
        return baseFuelConsumption;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }





    public void setColor(String color) {
        this.color = color;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setBaseFuelConsumption(int baseFuelConsumption) {
        this.baseFuelConsumption = baseFuelConsumption;
    }
}
