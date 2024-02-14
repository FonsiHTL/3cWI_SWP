package at.leander.ObjektOrientierteProgrammierung.at.xxx.examples.cars;

public class Producer {
    private String producerCountry;
    private String producerName;
    private int producerDiscount;

    public Producer(String producerCountry, String producerName, int producerDiscount) {
        this.producerCountry = producerCountry;
        this.producerName = producerName;
        this.producerDiscount = producerDiscount;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public String getProducerName() {
        return producerName;
    }

    public int getProducerDiscount() {
        return producerDiscount;
    }

    public void setProducerCountry(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public void setProducerDiscount(int producerDiscount) {
        this.producerDiscount = producerDiscount;
    }
}
