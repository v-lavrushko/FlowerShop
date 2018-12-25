import java.util.ArrayList;
import java.util.Scanner;

public class CustomBouquetCart extends DecoratedCart {
    FlowerShop flowerShop;

    public CustomBouquetCart(ShoppingCart cart, FlowerShop shop) {
        super(cart);
        this.flowerShop = shop;
    }

    static Flower[] customFlowers() {
        ArrayList<Flower> flowers = new ArrayList<Flower>();
        String flower = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\tWhat flower do you want?\n\t(name, color, special attributes)");
            flower = input.next().toLowerCase();
            String color = input.next();
            String[] attributes = input.nextLine().split(" ");
            switch (flower) {
                case "rose":
                    flowers.add(new Rose(color, 2, attributes));
                    break;
                case "tulip":
                    flowers.add(new Tulip(color, 1.55, attributes));
                    break;
                case "violet":
                    flowers.add(new Violet(color, 1.25, attributes));
                    break;
                default:
                    break;
            }
            System.out.println(flower);
        } while (!flower.equals("done"));
        Flower[] flowersarr = new Flower[flowers.size()];
        flowersarr = flowers.toArray(flowersarr);
        return flowersarr;
    }

    @Override
    public Bouquet chooseBouquet(String input) {
        switch (input) {
            case "custom":
                Bouquet buyingBouquet = flowerShop.create_custom(customFlowers());
                System.out.println(buyingBouquet.toString());
                return buyingBouquet;
            default:
                return this.cart.chooseBouquet(input);
        }
    }
}
