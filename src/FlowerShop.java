public class FlowerShop {
    private Bouquet[] dafault_bouquets = new Bouquet[3];

    public FlowerShop() {
        Flower ryb[] = {new Tulip("yellow", 1.55), new Rose("red", 2, false), new Violet("blue", 1.12)};
        this.dafault_bouquets[0] = new Bouquet(ryb);
        Flower[] _101_roses = new Flower[101];
        for (int i = 0; i < 101; i++) {
            _101_roses[i] = new Rose("red", 2, false);
        }
        this.dafault_bouquets[1] = new Bouquet(_101_roses);
        Flower ocean_of_tulips[] = new Flower[25];
        for (int i = 0; i < 25; i++) {
            ocean_of_tulips[i] = new Tulip(Tulip.avalible_colors[i % 5], 1.5);
        }
        this.dafault_bouquets[2] = new Bouquet(ocean_of_tulips);
    }

    public Bouquet custom_bouquet(Flower flowers[]) {
        return new Bouquet(flowers);
    }

    public double buy(Bouquet bouquet) {
        return bouquet.price();
    }
}
