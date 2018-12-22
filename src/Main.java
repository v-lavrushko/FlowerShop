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
                    continue;
                case "tulip":
                    flowers.add(new Tulip(color, 1.55, attributes));
                    continue;
                case "violet":
                    flowers.add(new Violet(color, 1.25, attributes));
                    continue;
                default:
            }
        } while (!flower.equals(""));
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
        switch (order) {
            case "101 roses":
            case "101":
            case "roses":
                System.out.printf("That will be %f $, sweetheart", oneOOneRoses.getPrice());
                return;
            case "ocean of tulips":
            case "ocean":
            case "tulips":
                System.out.printf("That will be %f $, sweetheart", oceanOfTulips.getPrice());
                return;
            case "ryb":
            case "red yellow blue":
                System.out.printf("That will be %f $, sweetheart", ryb.getPrice());
                return;
            case "custom":
                Bouquet custom = flowerShop.create_custom(customFlowers(input));
                System.out.printf("That will be %f $, sweetheart", ryb.getPrice());
                return;
            default:
                System.out.println("Sorry, I didn't get it");
        }
    }
}