public class Rose extends Flower {

    public static final String[] avalible_colors = {"red", "yellow", "cream", "pink"};
    private boolean spikes;

    public Rose(String color, double price, boolean spikes) {
        super(color, "citrusy", 20, price);
        this.spikes = spikes;
    }
}
