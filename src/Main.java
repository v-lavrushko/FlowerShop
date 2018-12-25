import java.util.*;

public class Main {

    static Flower[] customFlowers(Scanner input) {
        ArrayList<Flower> flowers = new ArrayList<Flower>();
        String flower = "";
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

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        System.out.println("\tWhat do you want, dear?");
        System.out.println("\tAlready formed bouquets:");
        Bouquet oneOOneRoses = flowerShop.create101Roses();
        System.out.printf("\t\"101 roses\":\n%s", oneOOneRoses.toString());
        Bouquet oceanOfTulips = flowerShop.createOceanOfTulips();
        System.out.printf("\t\"Ocean of tulips\":\n%s", oceanOfTulips.toString());
        Bouquet ryb = flowerShop.createRyb();
        System.out.printf("\t\"Red Yellow Blue\":\n%s", ryb.toString());
        System.out.println("\tOr do you want a custom one?\n");
        Scanner input = new Scanner(System.in);
        String order = input.next().toLowerCase();
        Bouquet buyingBouquet;
        switch (order) {
            case "101 roses":
            case "101":
            case "roses":
                buyingBouquet = oneOOneRoses;
                break;
            case "ocean of tulips":
            case "ocean":
            case "tulips":
                buyingBouquet = oceanOfTulips;
                break;
            case "ryb":
            case "red yellow blue":
                buyingBouquet = ryb;
                break;
            case "custom":
                buyingBouquet = flowerShop.create_custom(customFlowers(input));
                System.out.println(buyingBouquet.toString());
                break;
            default:
                System.out.println("Sorry, I didn't get it");
                return;
        }
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