public class Bouquet {

    private Flower flowers[];

    public Bouquet(Flower flowers[]){
        this.flowers = flowers;
    }
    
    public double price(){
        float price = 0;
        for (Flower flower: flowers) {
            price += flower.price();
        }
        return price;
    }
}
