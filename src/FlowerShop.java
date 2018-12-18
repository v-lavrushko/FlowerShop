public class FlowerShop {
    private String[] dafault_bouquets = {};

    public FlowerShop() {
        FlowerColors avalibleColors = new FlowerColors();
    }

    public Bouquet createOceanOfTulips() {
        Flower oceanOfTulips[] = new Flower[25];
        for (int i = 0; i < 25; i++) {
            oceanOfTulips[i] = new Tulip(FlowerColors.getAvalibleColors("Tulip")[i % 5], 1.5);
        }
        return new Bouquet(oceanOfTulips);
    }

    public Bouquet createRyb() {
        Flower ryb[] = {new Tulip("yellow", 1.55), new Rose("red", 2, false), new Violet("blue", 1.12)};
        return new Bouquet(ryb);
    }

    public Bouquet create101Roses() {
        Flower[] oneHundredOneroses = new Flower[101];
        for (int i = 0; i < 101; i++) {
            oneHundredOneroses[i] = new Rose("red", 2, false);
        }
        return new Bouquet(oneHundredOneroses);
    }

    public Bouquet custom_bouquet(Flower flowers[]) {
        return new Bouquet(flowers);
    }

    public double buy(Bouquet bouquet) {
        return bouquet.getPrice();
    }
}
