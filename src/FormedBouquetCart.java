import java.util.Map;

public class FormedBouquetCart implements ShoppingCart{

    public Map<String, Bouquet> formedBouquets;

    public FormedBouquetCart( Map<String, Bouquet> formedBouquets) {
        this.formedBouquets = formedBouquets;
    }

    @Override
    public Bouquet chooseBouquet(String input) {
        switch (input) {
            case "101 roses":
            case "101":
            case "roses":
                return formedBouquets.get("101roses");
            case "ocean of tulips":
            case "ocean":
            case "tulips":
                return formedBouquets.get("oceanOfTulips");
            case "ryb":
            case "red yellow blue":
                return formedBouquets.get("RedYellowBlue");
            /*case "custom":

                break;*/
            default:
                System.out.println("Sorry, I didn't get it");
                return new Bouquet(new Flower[0]);
        }
    }
}
