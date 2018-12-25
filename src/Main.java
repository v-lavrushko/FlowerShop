import java.util.*;

public class Main {

    /*To buy a formed bouquet, just enter it's name.
    * For a custom one, just enter word "custom" and
    * type wanted flowers with colors and special attributes.
    * To end creating custom bouquet enter "done custom"*/

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();

        Map<String, Bouquet> formedBouquets= new HashMap<>();
        System.out.println("\tWhat do you want, dear?");

        System.out.println("\tAlready formed bouquets:");
        formedBouquets.put("101roses", flowerShop.create101Roses());
        System.out.printf("\t\"101 roses\":\n%s", formedBouquets.get("101roses").toString());
        formedBouquets.put("oceanOfTulips", flowerShop.createOceanOfTulips());
        System.out.printf("\t\"Ocean of Tulips\":\n%s", formedBouquets.get("oceanOfTulips").toString());
        formedBouquets.put("RedYellowBlue", flowerShop.createRyb());
        System.out.printf("\t\"Red Yellow Blue\":\n%s", formedBouquets.get("RedYellowBlue").toString());
        System.out.println("\tOr do you want a custom one?\n");

        Scanner input = new Scanner(System.in);
        String order = input.next().toLowerCase();

        ShoppingCart shoppingCart = new CustomBouquetCart(new FormedBouquetCart(formedBouquets), flowerShop);
        Bouquet buyingBouquet = shoppingCart.chooseBouquet(order);

        System.out.println("Cash or Card?");
        String answer = input.next().toLowerCase();
        PayingMethod payingMethod;
        switch (answer) {
            case "cash":
                payingMethod = new PayingMethod(new CashPayment());
                break;
            case "card":
                payingMethod = new PayingMethod(new CardPayment());
                break;
                default:
                    System.out.println("Sorry, I didn't get it");
                    return;
        }
        payingMethod.pay(buyingBouquet.getPrice());
    }
}