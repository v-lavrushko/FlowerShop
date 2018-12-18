public class Bouquet {

    private Flower flowers[];

    Bouquet(Flower flowers[]){
        this.flowers = flowers;
    }
    
    double getPrice(){
        float price = 0;
        for (Flower flower: flowers) {
            price += flower.getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        String str = "";
        for (Flower flower: this.flowers) {
            str = str.concat(String.format("%s\n", flower.toString()));
        }
        return str;
    }
}
