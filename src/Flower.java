public abstract class Flower {

    private String color;
    private String odor;
    private int stem_length;
    private double price;

    public Flower(String color, String odor, int stem_length, double price) {
        this.color = color;
        this.odor = odor;
        this.stem_length = stem_length;
        this.price = price;
    }

    public double price(){
        return this.price;
    }
}
