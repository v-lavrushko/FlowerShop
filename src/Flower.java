public abstract class Flower {

    private String color;
    private String odor;
    private int stemLength;
    private double price;

    Flower(String color, String odor, int stemLength, double price) {
        this.color = color;
        this.odor = odor;
        this.stemLength = stemLength;
        this.price = price;
    }

    double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, %s cm high, %s $", this.color, this.odor ,this.getClass().getName(), this.stemLength, this.price);
    }
}
