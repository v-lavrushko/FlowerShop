import java.util.ArrayList;

public abstract class Flower {

    private String color;
    private String odor;
    private int stemLength;
    private double price;
    private String[] attributes;

    Flower(String color, String odor, int stemLength, double price, String[] attributes) {
        this.color = color;
        this.odor = odor;
        this.stemLength = stemLength;
        this.price = price;
        this.attributes = attributes;
    }

    double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, %s cm high, %s $", this.color, this.odor ,this.getClass().getName(), this.stemLength, this.price);
    }
}
