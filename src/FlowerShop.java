public class FlowerShop {
    private String[] dafault_bouquets = {};
    private String[] avalibleColors = {"Red", "White", "Yellow", "Green", "Orange"};

    public FlowerShop() {
    }

    public Bouquet createOceanOfTulips() {
        Flower oceanOfTulips[] = new Flower[25];
        for (int i = 0; i < 25; i++) {
            oceanOfTulips[i] = new Tulip(avalibleColors[i % 5], 1.5, new String[0]);
        }
        return new Bouquet(oceanOfTulips);
    }

    public Bouquet createRyb() {
        Flower ryb[] = {new Tulip("yellow", 1.55, new String[0]),
                        new Rose("red", 2, new String[0]),
                        new Violet("blue", 1.12, new String[0])};
        return new Bouquet(ryb);
    }

    public Bouquet create101Roses() {
        Flower[] oneHundredOneroses = new Flower[101];
        for (int i = 0; i < 101; i++) {
            oneHundredOneroses[i] = new Rose("red", 2, new String[0]);
        }
        return new Bouquet(oneHundredOneroses);
    }

    public Bouquet create_custom(Flower flowers[]) {
        return new Bouquet(flowers);
    }

    public double buy(Bouquet bouquet) {
        return bouquet.getPrice();
    }
}
